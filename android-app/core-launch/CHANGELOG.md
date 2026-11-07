# core-launch 变更记录

## 0.2.0 — 内存档位自适应（M3）

### 新增
- `MemoryProfile.kt`：按设备总内存（MB）推导推荐内存档位
  - `MemoryTier`：DISABLED（≤3GB，不建议启动）/ LOW（4GB）/ MID（6GB）/ HIGH（≥8GB）
  - 档位表：≤3072→512/1024（仅限尝试）；≤4096→1024/2048；≤6144→1536/2560；其余→2048/4096
  - 安全上限：推荐 max ≤ 总内存 45%，超出自动下调并记录原因（含禁启档提示 MC 1.20.1 最低需求）
- `LaunchOptions.forDevice(totalMemMB, userOverride?)`：工厂方法。用户显式设置优先，
  但 max 钳制到总内存 60%（warning 级说明）；min > 调整后 max 时同步下调。
  返回值通过新增字段 `LaunchOptions.memoryNotes: List<MemoryNote>` 携带全部调整说明。
- `MemoryProfileTest`：15 个用例覆盖档位边界（2999/3072/4096/6144/8192/16384）、
  极小设备钳制、override 钳制与 warning 说明、禁启档、非法输入。

### 集成（LaunchService × MemoryProfile）
- `LaunchService` 构造参数新增 `totalMemMB: Long?`（默认 null）：
  null/非正数时行为与之前完全一致（内存完全按 options 原样使用）。
- `assembleLaunchPlan` 现在自动套用设备档位：
  - options 未显式指定内存（min/max 任一为 null 或 ≤0）→ 用 `LaunchOptions.forDevice`
    的档位推荐值填充 min/max；
  - min/max 均显式指定 → 用户设置优先，仍走 forDevice 的 60% 钳制逻辑；
  - 调整说明写入 `LaunchPlan` 新增字段 `memoryNotes: List<MemoryNote>`（默认空），
    供 UI 启动前展示。
- `LaunchServiceTest`：新增 6 个用例（无 totalMemMB 透传、自动套档、低内存推荐钳制、
  显式设置优先+60% 钳制、cap 内原样、0 值视为未指定）。

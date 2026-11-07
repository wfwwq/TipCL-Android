package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.class */
public class VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extends Struct<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN;
    public static final int EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE;
    public static final int EXTENDEDDYNAMICSTATE3POLYGONMODE;
    public static final int EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES;
    public static final int EXTENDEDDYNAMICSTATE3SAMPLEMASK;
    public static final int EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE;
    public static final int EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE;
    public static final int EXTENDEDDYNAMICSTATE3LOGICOPENABLE;
    public static final int EXTENDEDDYNAMICSTATE3COLORBLENDENABLE;
    public static final int EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION;
    public static final int EXTENDEDDYNAMICSTATE3COLORWRITEMASK;
    public static final int EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM;
    public static final int EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE;
    public static final int EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE;
    public static final int EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE;
    public static final int EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE;
    public static final int EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED;
    public static final int EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE;
    public static final int EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE;
    public static final int EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE;
    public static final int EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE;
    public static final int EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE;
    public static final int EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE;
    public static final int EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE;
    public static final int EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE;
    public static final int EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN = layout.offsetof(2);
        EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE = layout.offsetof(3);
        EXTENDEDDYNAMICSTATE3POLYGONMODE = layout.offsetof(4);
        EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES = layout.offsetof(5);
        EXTENDEDDYNAMICSTATE3SAMPLEMASK = layout.offsetof(6);
        EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE = layout.offsetof(7);
        EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE = layout.offsetof(8);
        EXTENDEDDYNAMICSTATE3LOGICOPENABLE = layout.offsetof(9);
        EXTENDEDDYNAMICSTATE3COLORBLENDENABLE = layout.offsetof(10);
        EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION = layout.offsetof(11);
        EXTENDEDDYNAMICSTATE3COLORWRITEMASK = layout.offsetof(12);
        EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM = layout.offsetof(13);
        EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE = layout.offsetof(14);
        EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(15);
        EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE = layout.offsetof(16);
        EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE = layout.offsetof(17);
        EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED = layout.offsetof(18);
        EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE = layout.offsetof(19);
        EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE = layout.offsetof(20);
        EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE = layout.offsetof(21);
        EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE = layout.offsetof(22);
        EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE = layout.offsetof(23);
        EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE = layout.offsetof(24);
        EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE = layout.offsetof(25);
        EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION = layout.offsetof(26);
        EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE = layout.offsetof(27);
        EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE = layout.offsetof(28);
        EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE = layout.offsetof(29);
        EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE = layout.offsetof(30);
        EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE = layout.offsetof(31);
        EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE = layout.offsetof(32);
    }

    protected VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(address, container);
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3TessellationDomainOrigin() {
        return nextendedDynamicState3TessellationDomainOrigin(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3DepthClampEnable() {
        return nextendedDynamicState3DepthClampEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3PolygonMode() {
        return nextendedDynamicState3PolygonMode(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3RasterizationSamples() {
        return nextendedDynamicState3RasterizationSamples(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3SampleMask() {
        return nextendedDynamicState3SampleMask(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3AlphaToCoverageEnable() {
        return nextendedDynamicState3AlphaToCoverageEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3AlphaToOneEnable() {
        return nextendedDynamicState3AlphaToOneEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3LogicOpEnable() {
        return nextendedDynamicState3LogicOpEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ColorBlendEnable() {
        return nextendedDynamicState3ColorBlendEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ColorBlendEquation() {
        return nextendedDynamicState3ColorBlendEquation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ColorWriteMask() {
        return nextendedDynamicState3ColorWriteMask(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3RasterizationStream() {
        return nextendedDynamicState3RasterizationStream(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ConservativeRasterizationMode() {
        return nextendedDynamicState3ConservativeRasterizationMode(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ExtraPrimitiveOverestimationSize() {
        return nextendedDynamicState3ExtraPrimitiveOverestimationSize(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3DepthClipEnable() {
        return nextendedDynamicState3DepthClipEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3SampleLocationsEnable() {
        return nextendedDynamicState3SampleLocationsEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ColorBlendAdvanced() {
        return nextendedDynamicState3ColorBlendAdvanced(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ProvokingVertexMode() {
        return nextendedDynamicState3ProvokingVertexMode(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3LineRasterizationMode() {
        return nextendedDynamicState3LineRasterizationMode(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3LineStippleEnable() {
        return nextendedDynamicState3LineStippleEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3DepthClipNegativeOneToOne() {
        return nextendedDynamicState3DepthClipNegativeOneToOne(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ViewportWScalingEnable() {
        return nextendedDynamicState3ViewportWScalingEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ViewportSwizzle() {
        return nextendedDynamicState3ViewportSwizzle(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageToColorEnable() {
        return nextendedDynamicState3CoverageToColorEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageToColorLocation() {
        return nextendedDynamicState3CoverageToColorLocation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageModulationMode() {
        return nextendedDynamicState3CoverageModulationMode(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageModulationTableEnable() {
        return nextendedDynamicState3CoverageModulationTableEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageModulationTable() {
        return nextendedDynamicState3CoverageModulationTable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3CoverageReductionMode() {
        return nextendedDynamicState3CoverageReductionMode(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3RepresentativeFragmentTestEnable() {
        return nextendedDynamicState3RepresentativeFragmentTestEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState3ShadingRateImageEnable() {
        return nextendedDynamicState3ShadingRateImageEnable(address()) != 0;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT sType$Default() {
        return sType(EXTExtendedDynamicState3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT);
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3TessellationDomainOrigin(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3TessellationDomainOrigin(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClampEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3DepthClampEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3PolygonMode(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3PolygonMode(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationSamples(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3RasterizationSamples(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleMask(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3SampleMask(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToCoverageEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3AlphaToCoverageEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3AlphaToOneEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3AlphaToOneEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LogicOpEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3LogicOpEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ColorBlendEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendEquation(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ColorBlendEquation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorWriteMask(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ColorWriteMask(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RasterizationStream(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3RasterizationStream(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ConservativeRasterizationMode(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ConservativeRasterizationMode(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ExtraPrimitiveOverestimationSize(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ExtraPrimitiveOverestimationSize(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3DepthClipEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3SampleLocationsEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3SampleLocationsEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ColorBlendAdvanced(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ColorBlendAdvanced(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ProvokingVertexMode(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ProvokingVertexMode(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineRasterizationMode(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3LineRasterizationMode(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3LineStippleEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3LineStippleEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3DepthClipNegativeOneToOne(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3DepthClipNegativeOneToOne(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportWScalingEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ViewportWScalingEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ViewportSwizzle(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ViewportSwizzle(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3CoverageToColorEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageToColorLocation(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3CoverageToColorLocation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationMode(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3CoverageModulationMode(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTableEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3CoverageModulationTableEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageModulationTable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3CoverageModulationTable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3CoverageReductionMode(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3CoverageReductionMode(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3RepresentativeFragmentTestEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3RepresentativeFragmentTestEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT extendedDynamicState3ShadingRateImageEnable(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState3ShadingRateImageEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT set(int sType, long pNext, boolean extendedDynamicState3TessellationDomainOrigin, boolean extendedDynamicState3DepthClampEnable, boolean extendedDynamicState3PolygonMode, boolean extendedDynamicState3RasterizationSamples, boolean extendedDynamicState3SampleMask, boolean extendedDynamicState3AlphaToCoverageEnable, boolean extendedDynamicState3AlphaToOneEnable, boolean extendedDynamicState3LogicOpEnable, boolean extendedDynamicState3ColorBlendEnable, boolean extendedDynamicState3ColorBlendEquation, boolean extendedDynamicState3ColorWriteMask, boolean extendedDynamicState3RasterizationStream, boolean extendedDynamicState3ConservativeRasterizationMode, boolean extendedDynamicState3ExtraPrimitiveOverestimationSize, boolean extendedDynamicState3DepthClipEnable, boolean extendedDynamicState3SampleLocationsEnable, boolean extendedDynamicState3ColorBlendAdvanced, boolean extendedDynamicState3ProvokingVertexMode, boolean extendedDynamicState3LineRasterizationMode, boolean extendedDynamicState3LineStippleEnable, boolean extendedDynamicState3DepthClipNegativeOneToOne, boolean extendedDynamicState3ViewportWScalingEnable, boolean extendedDynamicState3ViewportSwizzle, boolean extendedDynamicState3CoverageToColorEnable, boolean extendedDynamicState3CoverageToColorLocation, boolean extendedDynamicState3CoverageModulationMode, boolean extendedDynamicState3CoverageModulationTableEnable, boolean extendedDynamicState3CoverageModulationTable, boolean extendedDynamicState3CoverageReductionMode, boolean extendedDynamicState3RepresentativeFragmentTestEnable, boolean extendedDynamicState3ShadingRateImageEnable) {
        sType(sType);
        pNext(pNext);
        extendedDynamicState3TessellationDomainOrigin(extendedDynamicState3TessellationDomainOrigin);
        extendedDynamicState3DepthClampEnable(extendedDynamicState3DepthClampEnable);
        extendedDynamicState3PolygonMode(extendedDynamicState3PolygonMode);
        extendedDynamicState3RasterizationSamples(extendedDynamicState3RasterizationSamples);
        extendedDynamicState3SampleMask(extendedDynamicState3SampleMask);
        extendedDynamicState3AlphaToCoverageEnable(extendedDynamicState3AlphaToCoverageEnable);
        extendedDynamicState3AlphaToOneEnable(extendedDynamicState3AlphaToOneEnable);
        extendedDynamicState3LogicOpEnable(extendedDynamicState3LogicOpEnable);
        extendedDynamicState3ColorBlendEnable(extendedDynamicState3ColorBlendEnable);
        extendedDynamicState3ColorBlendEquation(extendedDynamicState3ColorBlendEquation);
        extendedDynamicState3ColorWriteMask(extendedDynamicState3ColorWriteMask);
        extendedDynamicState3RasterizationStream(extendedDynamicState3RasterizationStream);
        extendedDynamicState3ConservativeRasterizationMode(extendedDynamicState3ConservativeRasterizationMode);
        extendedDynamicState3ExtraPrimitiveOverestimationSize(extendedDynamicState3ExtraPrimitiveOverestimationSize);
        extendedDynamicState3DepthClipEnable(extendedDynamicState3DepthClipEnable);
        extendedDynamicState3SampleLocationsEnable(extendedDynamicState3SampleLocationsEnable);
        extendedDynamicState3ColorBlendAdvanced(extendedDynamicState3ColorBlendAdvanced);
        extendedDynamicState3ProvokingVertexMode(extendedDynamicState3ProvokingVertexMode);
        extendedDynamicState3LineRasterizationMode(extendedDynamicState3LineRasterizationMode);
        extendedDynamicState3LineStippleEnable(extendedDynamicState3LineStippleEnable);
        extendedDynamicState3DepthClipNegativeOneToOne(extendedDynamicState3DepthClipNegativeOneToOne);
        extendedDynamicState3ViewportWScalingEnable(extendedDynamicState3ViewportWScalingEnable);
        extendedDynamicState3ViewportSwizzle(extendedDynamicState3ViewportSwizzle);
        extendedDynamicState3CoverageToColorEnable(extendedDynamicState3CoverageToColorEnable);
        extendedDynamicState3CoverageToColorLocation(extendedDynamicState3CoverageToColorLocation);
        extendedDynamicState3CoverageModulationMode(extendedDynamicState3CoverageModulationMode);
        extendedDynamicState3CoverageModulationTableEnable(extendedDynamicState3CoverageModulationTableEnable);
        extendedDynamicState3CoverageModulationTable(extendedDynamicState3CoverageModulationTable);
        extendedDynamicState3CoverageReductionMode(extendedDynamicState3CoverageReductionMode);
        extendedDynamicState3RepresentativeFragmentTestEnable(extendedDynamicState3RepresentativeFragmentTestEnable);
        extendedDynamicState3ShadingRateImageEnable(extendedDynamicState3ShadingRateImageEnable);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT set(VkPhysicalDeviceExtendedDynamicState3FeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT malloc() {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT calloc() {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create(long address) {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedDynamicState3FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nextendedDynamicState3TessellationDomainOrigin(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN);
    }

    public static int nextendedDynamicState3DepthClampEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE);
    }

    public static int nextendedDynamicState3PolygonMode(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3POLYGONMODE);
    }

    public static int nextendedDynamicState3RasterizationSamples(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES);
    }

    public static int nextendedDynamicState3SampleMask(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3SAMPLEMASK);
    }

    public static int nextendedDynamicState3AlphaToCoverageEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE);
    }

    public static int nextendedDynamicState3AlphaToOneEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE);
    }

    public static int nextendedDynamicState3LogicOpEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3LOGICOPENABLE);
    }

    public static int nextendedDynamicState3ColorBlendEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COLORBLENDENABLE);
    }

    public static int nextendedDynamicState3ColorBlendEquation(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION);
    }

    public static int nextendedDynamicState3ColorWriteMask(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COLORWRITEMASK);
    }

    public static int nextendedDynamicState3RasterizationStream(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM);
    }

    public static int nextendedDynamicState3ConservativeRasterizationMode(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE);
    }

    public static int nextendedDynamicState3ExtraPrimitiveOverestimationSize(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE);
    }

    public static int nextendedDynamicState3DepthClipEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE);
    }

    public static int nextendedDynamicState3SampleLocationsEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE);
    }

    public static int nextendedDynamicState3ColorBlendAdvanced(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED);
    }

    public static int nextendedDynamicState3ProvokingVertexMode(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE);
    }

    public static int nextendedDynamicState3LineRasterizationMode(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE);
    }

    public static int nextendedDynamicState3LineStippleEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE);
    }

    public static int nextendedDynamicState3DepthClipNegativeOneToOne(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE);
    }

    public static int nextendedDynamicState3ViewportWScalingEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE);
    }

    public static int nextendedDynamicState3ViewportSwizzle(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE);
    }

    public static int nextendedDynamicState3CoverageToColorEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE);
    }

    public static int nextendedDynamicState3CoverageToColorLocation(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION);
    }

    public static int nextendedDynamicState3CoverageModulationMode(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE);
    }

    public static int nextendedDynamicState3CoverageModulationTableEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE);
    }

    public static int nextendedDynamicState3CoverageModulationTable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE);
    }

    public static int nextendedDynamicState3CoverageReductionMode(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE);
    }

    public static int nextendedDynamicState3RepresentativeFragmentTestEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE);
    }

    public static int nextendedDynamicState3ShadingRateImageEnable(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nextendedDynamicState3TessellationDomainOrigin(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3TESSELLATIONDOMAINORIGIN, value);
    }

    public static void nextendedDynamicState3DepthClampEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3DEPTHCLAMPENABLE, value);
    }

    public static void nextendedDynamicState3PolygonMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3POLYGONMODE, value);
    }

    public static void nextendedDynamicState3RasterizationSamples(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3RASTERIZATIONSAMPLES, value);
    }

    public static void nextendedDynamicState3SampleMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3SAMPLEMASK, value);
    }

    public static void nextendedDynamicState3AlphaToCoverageEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3ALPHATOCOVERAGEENABLE, value);
    }

    public static void nextendedDynamicState3AlphaToOneEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3ALPHATOONEENABLE, value);
    }

    public static void nextendedDynamicState3LogicOpEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3LOGICOPENABLE, value);
    }

    public static void nextendedDynamicState3ColorBlendEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COLORBLENDENABLE, value);
    }

    public static void nextendedDynamicState3ColorBlendEquation(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COLORBLENDEQUATION, value);
    }

    public static void nextendedDynamicState3ColorWriteMask(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COLORWRITEMASK, value);
    }

    public static void nextendedDynamicState3RasterizationStream(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3RASTERIZATIONSTREAM, value);
    }

    public static void nextendedDynamicState3ConservativeRasterizationMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3CONSERVATIVERASTERIZATIONMODE, value);
    }

    public static void nextendedDynamicState3ExtraPrimitiveOverestimationSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3EXTRAPRIMITIVEOVERESTIMATIONSIZE, value);
    }

    public static void nextendedDynamicState3DepthClipEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3DEPTHCLIPENABLE, value);
    }

    public static void nextendedDynamicState3SampleLocationsEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3SAMPLELOCATIONSENABLE, value);
    }

    public static void nextendedDynamicState3ColorBlendAdvanced(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COLORBLENDADVANCED, value);
    }

    public static void nextendedDynamicState3ProvokingVertexMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3PROVOKINGVERTEXMODE, value);
    }

    public static void nextendedDynamicState3LineRasterizationMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3LINERASTERIZATIONMODE, value);
    }

    public static void nextendedDynamicState3LineStippleEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3LINESTIPPLEENABLE, value);
    }

    public static void nextendedDynamicState3DepthClipNegativeOneToOne(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3DEPTHCLIPNEGATIVEONETOONE, value);
    }

    public static void nextendedDynamicState3ViewportWScalingEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3VIEWPORTWSCALINGENABLE, value);
    }

    public static void nextendedDynamicState3ViewportSwizzle(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3VIEWPORTSWIZZLE, value);
    }

    public static void nextendedDynamicState3CoverageToColorEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COVERAGETOCOLORENABLE, value);
    }

    public static void nextendedDynamicState3CoverageToColorLocation(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COVERAGETOCOLORLOCATION, value);
    }

    public static void nextendedDynamicState3CoverageModulationMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONMODE, value);
    }

    public static void nextendedDynamicState3CoverageModulationTableEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLEENABLE, value);
    }

    public static void nextendedDynamicState3CoverageModulationTable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COVERAGEMODULATIONTABLE, value);
    }

    public static void nextendedDynamicState3CoverageReductionMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3COVERAGEREDUCTIONMODE, value);
    }

    public static void nextendedDynamicState3RepresentativeFragmentTestEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3REPRESENTATIVEFRAGMENTTESTENABLE, value);
    }

    public static void nextendedDynamicState3ShadingRateImageEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE3SHADINGRATEIMAGEENABLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState3FeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExtendedDynamicState3FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3TessellationDomainOrigin() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3TessellationDomainOrigin(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3DepthClampEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClampEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3PolygonMode() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3PolygonMode(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3RasterizationSamples() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationSamples(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3SampleMask() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleMask(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3AlphaToCoverageEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToCoverageEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3AlphaToOneEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToOneEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3LogicOpEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LogicOpEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ColorBlendEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ColorBlendEquation() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEquation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ColorWriteMask() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorWriteMask(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3RasterizationStream() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationStream(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ConservativeRasterizationMode() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ConservativeRasterizationMode(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ExtraPrimitiveOverestimationSize() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ExtraPrimitiveOverestimationSize(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3DepthClipEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3SampleLocationsEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleLocationsEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ColorBlendAdvanced() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendAdvanced(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ProvokingVertexMode() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ProvokingVertexMode(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3LineRasterizationMode() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineRasterizationMode(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3LineStippleEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineStippleEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3DepthClipNegativeOneToOne() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipNegativeOneToOne(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ViewportWScalingEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportWScalingEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ViewportSwizzle() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportSwizzle(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageToColorEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageToColorLocation() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorLocation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageModulationMode() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationMode(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageModulationTableEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTableEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageModulationTable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3CoverageReductionMode() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageReductionMode(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3RepresentativeFragmentTestEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RepresentativeFragmentTestEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState3ShadingRateImageEnable() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ShadingRateImageEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTExtendedDynamicState3.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer extendedDynamicState3TessellationDomainOrigin(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3TessellationDomainOrigin(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3DepthClampEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClampEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3PolygonMode(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3PolygonMode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3RasterizationSamples(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationSamples(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3SampleMask(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleMask(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3AlphaToCoverageEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToCoverageEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3AlphaToOneEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3AlphaToOneEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3LogicOpEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LogicOpEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ColorBlendEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ColorBlendEquation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendEquation(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ColorWriteMask(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorWriteMask(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3RasterizationStream(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RasterizationStream(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ConservativeRasterizationMode(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ConservativeRasterizationMode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ExtraPrimitiveOverestimationSize(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ExtraPrimitiveOverestimationSize(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3DepthClipEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3SampleLocationsEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3SampleLocationsEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ColorBlendAdvanced(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ColorBlendAdvanced(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ProvokingVertexMode(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ProvokingVertexMode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3LineRasterizationMode(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineRasterizationMode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3LineStippleEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3LineStippleEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3DepthClipNegativeOneToOne(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3DepthClipNegativeOneToOne(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ViewportWScalingEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportWScalingEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ViewportSwizzle(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ViewportSwizzle(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3CoverageToColorEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3CoverageToColorLocation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageToColorLocation(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3CoverageModulationMode(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationMode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3CoverageModulationTableEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTableEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3CoverageModulationTable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageModulationTable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3CoverageReductionMode(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3CoverageReductionMode(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3RepresentativeFragmentTestEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3RepresentativeFragmentTestEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState3ShadingRateImageEnable(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.nextendedDynamicState3ShadingRateImageEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}

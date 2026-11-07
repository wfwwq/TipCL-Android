package org.apache.commons.lang3.builder;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import org.apache.commons.lang3.ArraySorter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.reflect.FieldUtils;

/* loaded from: classes24.dex */
public class ReflectionDiffBuilder<T> implements Builder<DiffResult<T>> {
    private final DiffBuilder<T> diffBuilder;
    private String[] excludeFieldNames;
    private final T left;
    private final T right;

    public ReflectionDiffBuilder(T lhs, T rhs, ToStringStyle style) {
        this.left = lhs;
        this.right = rhs;
        this.diffBuilder = new DiffBuilder<>(lhs, rhs, style);
    }

    private boolean accept(Field field) {
        if (field.getName().indexOf(36) != -1 || Modifier.isTransient(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
            return false;
        }
        if (this.excludeFieldNames == null || Arrays.binarySearch(this.excludeFieldNames, field.getName()) < 0) {
            return !field.isAnnotationPresent(DiffExclude.class);
        }
        return false;
    }

    private void appendFields(Class<?> clazz) {
        for (Field field : FieldUtils.getAllFields(clazz)) {
            if (accept(field)) {
                try {
                    this.diffBuilder.append(field.getName(), FieldUtils.readField(field, (Object) this.left, true), FieldUtils.readField(field, (Object) this.right, true));
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Unexpected IllegalAccessException: " + e.getMessage(), e);
                }
            }
        }
    }

    @Override // org.apache.commons.lang3.builder.Builder
    public DiffResult<T> build() {
        if (this.left.equals(this.right)) {
            return this.diffBuilder.build();
        }
        appendFields(this.left.getClass());
        return this.diffBuilder.build();
    }

    public String[] getExcludeFieldNames() {
        return (String[]) this.excludeFieldNames.clone();
    }

    public ReflectionDiffBuilder<T> setExcludeFieldNames(String... excludeFieldNamesParam) {
        if (excludeFieldNamesParam == null) {
            this.excludeFieldNames = ArrayUtils.EMPTY_STRING_ARRAY;
        } else {
            this.excludeFieldNames = (String[]) ArraySorter.sort(ReflectionToStringBuilder.toNoNullStringArray(excludeFieldNamesParam));
        }
        return this;
    }
}

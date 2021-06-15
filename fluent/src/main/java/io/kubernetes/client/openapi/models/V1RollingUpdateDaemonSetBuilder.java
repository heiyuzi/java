package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1RollingUpdateDaemonSetBuilder extends io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluentImpl<io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet,io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetBuilder> {

    io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1RollingUpdateDaemonSetBuilder() {
        this(true);
    }

    public V1RollingUpdateDaemonSetBuilder(java.lang.Boolean validationEnabled) {
        this(new V1RollingUpdateDaemonSet(), validationEnabled);
    }

    public V1RollingUpdateDaemonSetBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent) {
        this(fluent, true);
    }

    public V1RollingUpdateDaemonSetBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1RollingUpdateDaemonSet(), validationEnabled);
    }

    public V1RollingUpdateDaemonSetBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent,io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance) {
        this(fluent, instance, true);
    }

    public V1RollingUpdateDaemonSetBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSetFluent<?> fluent,io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMaxUnavailable(instance.getMaxUnavailable());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1RollingUpdateDaemonSetBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance) {
        this(instance,true);
    }

    public V1RollingUpdateDaemonSetBuilder(io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMaxUnavailable(instance.getMaxUnavailable());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1RollingUpdateDaemonSet build() {
        V1RollingUpdateDaemonSet buildable = new V1RollingUpdateDaemonSet();
        buildable.setMaxUnavailable(fluent.getMaxUnavailable());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1RollingUpdateDaemonSetBuilder that = (V1RollingUpdateDaemonSetBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

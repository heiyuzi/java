package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1GlusterfsPersistentVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource,io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1GlusterfsPersistentVolumeSourceBuilder() {
        this(true);
    }

    public V1GlusterfsPersistentVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1GlusterfsPersistentVolumeSource(), validationEnabled);
    }

    public V1GlusterfsPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1GlusterfsPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1GlusterfsPersistentVolumeSource(), validationEnabled);
    }

    public V1GlusterfsPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1GlusterfsPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withEndpoints(instance.getEndpoints());
        
        fluent.withEndpointsNamespace(instance.getEndpointsNamespace());
        
        fluent.withPath(instance.getPath());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1GlusterfsPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance) {
        this(instance,true);
    }

    public V1GlusterfsPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withEndpoints(instance.getEndpoints());
        
        this.withEndpointsNamespace(instance.getEndpointsNamespace());
        
        this.withPath(instance.getPath());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1GlusterfsPersistentVolumeSource build() {
        V1GlusterfsPersistentVolumeSource buildable = new V1GlusterfsPersistentVolumeSource();
        buildable.setEndpoints(fluent.getEndpoints());
        buildable.setEndpointsNamespace(fluent.getEndpointsNamespace());
        buildable.setPath(fluent.getPath());
        buildable.setReadOnly(fluent.getReadOnly());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1GlusterfsPersistentVolumeSourceBuilder that = (V1GlusterfsPersistentVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

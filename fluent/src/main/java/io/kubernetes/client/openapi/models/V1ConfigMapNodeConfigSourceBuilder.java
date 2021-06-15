package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ConfigMapNodeConfigSourceBuilder extends io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluentImpl<io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource,io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceBuilder> {

    io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ConfigMapNodeConfigSourceBuilder() {
        this(true);
    }

    public V1ConfigMapNodeConfigSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ConfigMapNodeConfigSource(), validationEnabled);
    }

    public V1ConfigMapNodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ConfigMapNodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ConfigMapNodeConfigSource(), validationEnabled);
    }

    public V1ConfigMapNodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance) {
        this(fluent, instance, true);
    }

    public V1ConfigMapNodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withKubeletConfigKey(instance.getKubeletConfigKey());
        
        fluent.withName(instance.getName());
        
        fluent.withNamespace(instance.getNamespace());
        
        fluent.withResourceVersion(instance.getResourceVersion());
        
        fluent.withUid(instance.getUid());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ConfigMapNodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance) {
        this(instance,true);
    }

    public V1ConfigMapNodeConfigSourceBuilder(io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withKubeletConfigKey(instance.getKubeletConfigKey());
        
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.withResourceVersion(instance.getResourceVersion());
        
        this.withUid(instance.getUid());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ConfigMapNodeConfigSource build() {
        V1ConfigMapNodeConfigSource buildable = new V1ConfigMapNodeConfigSource();
        buildable.setKubeletConfigKey(fluent.getKubeletConfigKey());
        buildable.setName(fluent.getName());
        buildable.setNamespace(fluent.getNamespace());
        buildable.setResourceVersion(fluent.getResourceVersion());
        buildable.setUid(fluent.getUid());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ConfigMapNodeConfigSourceBuilder that = (V1ConfigMapNodeConfigSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

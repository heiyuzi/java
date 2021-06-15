package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1NodeBuilder extends io.kubernetes.client.openapi.models.V1NodeFluentImpl<io.kubernetes.client.openapi.models.V1NodeBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Node,io.kubernetes.client.openapi.models.V1NodeBuilder> {

    io.kubernetes.client.openapi.models.V1NodeFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1NodeBuilder() {
        this(true);
    }

    public V1NodeBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Node(), validationEnabled);
    }

    public V1NodeBuilder(io.kubernetes.client.openapi.models.V1NodeFluent<?> fluent) {
        this(fluent, true);
    }

    public V1NodeBuilder(io.kubernetes.client.openapi.models.V1NodeFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Node(), validationEnabled);
    }

    public V1NodeBuilder(io.kubernetes.client.openapi.models.V1NodeFluent<?> fluent,io.kubernetes.client.openapi.models.V1Node instance) {
        this(fluent, instance, true);
    }

    public V1NodeBuilder(io.kubernetes.client.openapi.models.V1NodeFluent<?> fluent,io.kubernetes.client.openapi.models.V1Node instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withSpec(instance.getSpec());
        
        fluent.withStatus(instance.getStatus());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1NodeBuilder(io.kubernetes.client.openapi.models.V1Node instance) {
        this(instance,true);
    }

    public V1NodeBuilder(io.kubernetes.client.openapi.models.V1Node instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withSpec(instance.getSpec());
        
        this.withStatus(instance.getStatus());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Node build() {
        V1Node buildable = new V1Node();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setSpec(fluent.getSpec());
        buildable.setStatus(fluent.getStatus());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1NodeBuilder that = (V1NodeBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

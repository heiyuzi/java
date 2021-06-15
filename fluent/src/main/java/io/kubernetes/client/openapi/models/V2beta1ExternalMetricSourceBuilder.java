package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V2beta1ExternalMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource,io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceBuilder> {

    io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V2beta1ExternalMetricSourceBuilder() {
        this(true);
    }

    public V2beta1ExternalMetricSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V2beta1ExternalMetricSource(), validationEnabled);
    }

    public V2beta1ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V2beta1ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V2beta1ExternalMetricSource(), validationEnabled);
    }

    public V2beta1ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource instance) {
        this(fluent, instance, true);
    }

    public V2beta1ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withMetricName(instance.getMetricName());
        
        fluent.withMetricSelector(instance.getMetricSelector());
        
        fluent.withTargetAverageValue(instance.getTargetAverageValue());
        
        fluent.withTargetValue(instance.getTargetValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public V2beta1ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource instance) {
        this(instance,true);
    }

    public V2beta1ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withMetricName(instance.getMetricName());
        
        this.withMetricSelector(instance.getMetricSelector());
        
        this.withTargetAverageValue(instance.getTargetAverageValue());
        
        this.withTargetValue(instance.getTargetValue());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V2beta1ExternalMetricSource build() {
        V2beta1ExternalMetricSource buildable = new V2beta1ExternalMetricSource();
        buildable.setMetricName(fluent.getMetricName());
        buildable.setMetricSelector(fluent.getMetricSelector());
        buildable.setTargetAverageValue(fluent.getTargetAverageValue());
        buildable.setTargetValue(fluent.getTargetValue());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V2beta1ExternalMetricSourceBuilder that = (V2beta1ExternalMetricSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}

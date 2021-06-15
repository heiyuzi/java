package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class V1alpha1UserSubjectFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1UserSubjectFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1UserSubjectFluent<A> {

    private java.lang.String name;

    public V1alpha1UserSubjectFluentImpl() {
    }

    public V1alpha1UserSubjectFluentImpl(io.kubernetes.client.openapi.models.V1alpha1UserSubject instance) {
        this.withName(instance.getName());
    }

    public java.lang.String getName() {
        return this.name;
    }

    public A withName(java.lang.String name) {
        this.name=name; return (A) this;
    }

    public java.lang.Boolean hasName() {
        return this.name != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withName instead.
     */
        public A withNewName(java.lang.String original) {
        return (A)withName(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1alpha1UserSubjectFluentImpl that = (V1alpha1UserSubjectFluentImpl) o;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(name,  super.hashCode());
    }

}

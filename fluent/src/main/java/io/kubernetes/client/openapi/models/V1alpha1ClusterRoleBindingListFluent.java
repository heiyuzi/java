package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1alpha1ClusterRoleBindingListFluent<A extends io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public A addToItems(int index,io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding item);
    public A setToItems(int index,io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding item);
    public A addToItems(io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding... items);
    public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding> items);
    public A removeFromItems(io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding... items);
    public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding> items);
    public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildItems instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding> getItems();
    public java.util.List<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding> buildItems();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding buildItem(int index);
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding buildFirstItem();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding buildLastItem();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingBuilder> predicate);
    public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingBuilder> predicate);
    public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding> items);
    public A withItems(io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding... items);
    public java.lang.Boolean hasItems();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.ItemsNested<A> addNewItem();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding item);
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.ItemsNested<A> setNewItemLike(int index,io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBinding item);
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.ItemsNested<A> editItem(int index);
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.ItemsNested<A> editFirstItem();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.ItemsNested<A> editLastItem();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingBuilder> predicate);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ListMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item);
    public interface ItemsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingFluent<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.ItemsNested<N>> {

            public N and();
            public N endItem();    }


    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ListMetaFluent<io.kubernetes.client.openapi.models.V1alpha1ClusterRoleBindingListFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


}

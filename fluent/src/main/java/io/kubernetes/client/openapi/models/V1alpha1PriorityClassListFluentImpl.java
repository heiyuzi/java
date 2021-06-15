package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import java.util.Collection;
import java.lang.Object;

public class V1alpha1PriorityClassListFluentImpl<A extends io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent<A> {

    private java.lang.String apiVersion;
    private java.util.List<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder> items;
    private java.lang.String kind;
    private io.kubernetes.client.openapi.models.V1ListMetaBuilder metadata;

    public V1alpha1PriorityClassListFluentImpl() {
    }

    public V1alpha1PriorityClassListFluentImpl(io.kubernetes.client.openapi.models.V1alpha1PriorityClassList instance) {
        this.withApiVersion(instance.getApiVersion());
        
        this.withItems(instance.getItems());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
    }

    public java.lang.String getApiVersion() {
        return this.apiVersion;
    }

    public A withApiVersion(java.lang.String apiVersion) {
        this.apiVersion=apiVersion; return (A) this;
    }

    public java.lang.Boolean hasApiVersion() {
        return this.apiVersion != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original) {
        return (A)withApiVersion(new String(original));
    }

    public A addToItems(int index,io.kubernetes.client.openapi.models.V1alpha1PriorityClass item) {
        if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder(item);_visitables.get("items").add(index >= 0 ? index : _visitables.get("items").size(), builder);this.items.add(index >= 0 ? index : items.size(), builder); return (A)this;
    }

    public A setToItems(int index,io.kubernetes.client.openapi.models.V1alpha1PriorityClass item) {
        if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder>();}
        io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder(item);
        if (index < 0 || index >= _visitables.get("items").size()) { _visitables.get("items").add(builder); } else { _visitables.get("items").set(index, builder);}
        if (index < 0 || index >= items.size()) { items.add(builder); } else { items.set(index, builder);}
         return (A)this;
    }

    public A addToItems(io.kubernetes.client.openapi.models.V1alpha1PriorityClass... items) {
        if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1PriorityClass item : items) {io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
    }

    public A addAllToItems(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1PriorityClass> items) {
        if (this.items == null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder>();}
        for (io.kubernetes.client.openapi.models.V1alpha1PriorityClass item : items) {io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder(item);_visitables.get("items").add(builder);this.items.add(builder);} return (A)this;
    }

    public A removeFromItems(io.kubernetes.client.openapi.models.V1alpha1PriorityClass... items) {
        for (io.kubernetes.client.openapi.models.V1alpha1PriorityClass item : items) {io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeAllFromItems(java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1PriorityClass> items) {
        for (io.kubernetes.client.openapi.models.V1alpha1PriorityClass item : items) {io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder builder = new io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder(item);_visitables.get("items").remove(builder);if (this.items != null) {this.items.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromItems(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder> predicate) {
        if (items == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder> each = items.iterator();
        final List visitables = _visitables.get("items");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildItems instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1alpha1PriorityClass> getItems() {
        return build(items);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1alpha1PriorityClass> buildItems() {
        return build(items);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClass buildItem(int index) {
        return this.items.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClass buildFirstItem() {
        return this.items.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClass buildLastItem() {
        return this.items.get(items.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClass buildMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder item: items) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder item: items) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withItems(java.util.List<io.kubernetes.client.openapi.models.V1alpha1PriorityClass> items) {
        if (this.items != null) { _visitables.get("items").removeAll(this.items);}
        if (items != null) {this.items = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder>(); for (io.kubernetes.client.openapi.models.V1alpha1PriorityClass item : items){this.addToItems(item);}} else { this.items = null;} return (A) this;
    }

    public A withItems(io.kubernetes.client.openapi.models.V1alpha1PriorityClass... items) {
        if (this.items != null) {this.items.clear();}
        if (items != null) {for (io.kubernetes.client.openapi.models.V1alpha1PriorityClass item :items){ this.addToItems(item);}} return (A) this;
    }

    public java.lang.Boolean hasItems() {
        return items != null && !items.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.ItemsNested<A> addNewItem() {
        return new io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluentImpl.ItemsNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.ItemsNested<A> addNewItemLike(io.kubernetes.client.openapi.models.V1alpha1PriorityClass item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluentImpl.ItemsNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.ItemsNested<A> setNewItemLike(int index,io.kubernetes.client.openapi.models.V1alpha1PriorityClass item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluentImpl.ItemsNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.ItemsNested<A> editItem(int index) {
        if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
        return setNewItemLike(index, buildItem(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.ItemsNested<A> editFirstItem() {
        if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
        return setNewItemLike(0, buildItem(0));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.ItemsNested<A> editLastItem() {
        int index = items.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
        return setNewItemLike(index, buildItem(index));
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.ItemsNested<A> editMatchingItem(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder> predicate) {
        int index = -1;
        for (int i=0;i<items.size();i++) { 
        if (predicate.test(items.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
        return setNewItemLike(index, buildItem(index));
    }

    public java.lang.String getKind() {
        return this.kind;
    }

    public A withKind(java.lang.String kind) {
        this.kind=kind; return (A) this;
    }

    public java.lang.Boolean hasKind() {
        return this.kind != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original) {
        return (A)withKind(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ListMeta getMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata() {
        return this.metadata!=null?this.metadata.build():null;
    }

    public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata) {
        _visitables.get("metadata").remove(this.metadata);
        if (metadata!=null){ this.metadata= new io.kubernetes.client.openapi.models.V1ListMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} return (A) this;
    }

    public java.lang.Boolean hasMetadata() {
        return this.metadata != null;
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.MetadataNested<A> withNewMetadata() {
        return new io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluentImpl.MetadataNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item) {
        return new io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluentImpl.MetadataNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.MetadataNested<A> editMetadata() {
        return withNewMetadataLike(getMetadata());
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.MetadataNested<A> editOrNewMetadata() {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): new io.kubernetes.client.openapi.models.V1ListMetaBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item) {
        return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1alpha1PriorityClassListFluentImpl that = (V1alpha1PriorityClassListFluentImpl) o;
        if (apiVersion != null ? !apiVersion.equals(that.apiVersion) :that.apiVersion != null) return false;
        if (items != null ? !items.equals(that.items) :that.items != null) return false;
        if (kind != null ? !kind.equals(that.kind) :that.kind != null) return false;
        if (metadata != null ? !metadata.equals(that.metadata) :that.metadata != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(apiVersion,  items,  kind,  metadata,  super.hashCode());
    }

    public class ItemsNestedImpl<N> extends io.kubernetes.client.openapi.models.V1alpha1PriorityClassFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.ItemsNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.ItemsNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder builder;
        private final int index;

            ItemsNestedImpl(int index,io.kubernetes.client.openapi.models.V1alpha1PriorityClass item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder(this, item);
                        
            }

            ItemsNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1alpha1PriorityClassBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1PriorityClassListFluentImpl.this.setToItems(index,builder.build());
            }

            public N endItem() {
                return and();
            }
    }


    public class MetadataNestedImpl<N> extends io.kubernetes.client.openapi.models.V1ListMetaFluentImpl<io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.MetadataNested<N>> implements io.kubernetes.client.openapi.models.V1alpha1PriorityClassListFluent.MetadataNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1ListMetaBuilder builder;

            MetadataNestedImpl(io.kubernetes.client.openapi.models.V1ListMeta item) {
                this.builder = new io.kubernetes.client.openapi.models.V1ListMetaBuilder(this, item);
                        
            }

            MetadataNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1ListMetaBuilder(this);
                        
            }

            public N and() {
                return (N) V1alpha1PriorityClassListFluentImpl.this.withMetadata(builder.build());
            }

            public N endMetadata() {
                return and();
            }
    }


}

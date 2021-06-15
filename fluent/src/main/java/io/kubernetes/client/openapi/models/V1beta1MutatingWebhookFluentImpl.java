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
import java.lang.Integer;
import java.util.Collection;
import java.lang.Object;

public class V1beta1MutatingWebhookFluentImpl<A extends io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent<A> {

    private java.util.List<java.lang.String> admissionReviewVersions;
    private io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfigBuilder clientConfig;
    private java.lang.String failurePolicy;
    private java.lang.String matchPolicy;
    private java.lang.String name;
    private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder namespaceSelector;
    private io.kubernetes.client.openapi.models.V1LabelSelectorBuilder objectSelector;
    private java.lang.String reinvocationPolicy;
    private java.util.List<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder> rules;
    private java.lang.String sideEffects;
    private java.lang.Integer timeoutSeconds;

    public V1beta1MutatingWebhookFluentImpl() {
    }

    public V1beta1MutatingWebhookFluentImpl(io.kubernetes.client.openapi.models.V1beta1MutatingWebhook instance) {
        this.withAdmissionReviewVersions(instance.getAdmissionReviewVersions());
        
        this.withClientConfig(instance.getClientConfig());
        
        this.withFailurePolicy(instance.getFailurePolicy());
        
        this.withMatchPolicy(instance.getMatchPolicy());
        
        this.withName(instance.getName());
        
        this.withNamespaceSelector(instance.getNamespaceSelector());
        
        this.withObjectSelector(instance.getObjectSelector());
        
        this.withReinvocationPolicy(instance.getReinvocationPolicy());
        
        this.withRules(instance.getRules());
        
        this.withSideEffects(instance.getSideEffects());
        
        this.withTimeoutSeconds(instance.getTimeoutSeconds());
    }

    public A addToAdmissionReviewVersions(int index,java.lang.String item) {
        if (this.admissionReviewVersions == null) {this.admissionReviewVersions = new java.util.ArrayList<java.lang.String>();}
        this.admissionReviewVersions.add(index, item);
        return (A)this;
    }

    public A setToAdmissionReviewVersions(int index,java.lang.String item) {
        if (this.admissionReviewVersions == null) {this.admissionReviewVersions = new java.util.ArrayList<java.lang.String>();}
        this.admissionReviewVersions.set(index, item); return (A)this;
    }

    public A addToAdmissionReviewVersions(java.lang.String... items) {
        if (this.admissionReviewVersions == null) {this.admissionReviewVersions = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.admissionReviewVersions.add(item);} return (A)this;
    }

    public A addAllToAdmissionReviewVersions(java.util.Collection<java.lang.String> items) {
        if (this.admissionReviewVersions == null) {this.admissionReviewVersions = new java.util.ArrayList<java.lang.String>();}
        for (java.lang.String item : items) {this.admissionReviewVersions.add(item);} return (A)this;
    }

    public A removeFromAdmissionReviewVersions(java.lang.String... items) {
        for (java.lang.String item : items) {if (this.admissionReviewVersions!= null){ this.admissionReviewVersions.remove(item);}} return (A)this;
    }

    public A removeAllFromAdmissionReviewVersions(java.util.Collection<java.lang.String> items) {
        for (java.lang.String item : items) {if (this.admissionReviewVersions!= null){ this.admissionReviewVersions.remove(item);}} return (A)this;
    }

    public java.util.List<java.lang.String> getAdmissionReviewVersions() {
        return this.admissionReviewVersions;
    }

    public java.lang.String getAdmissionReviewVersion(int index) {
        return this.admissionReviewVersions.get(index);
    }

    public java.lang.String getFirstAdmissionReviewVersion() {
        return this.admissionReviewVersions.get(0);
    }

    public java.lang.String getLastAdmissionReviewVersion() {
        return this.admissionReviewVersions.get(admissionReviewVersions.size() - 1);
    }

    public java.lang.String getMatchingAdmissionReviewVersion(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: admissionReviewVersions) { if(predicate.test(item)){ return item;} } return null;
    }

    public java.lang.Boolean hasMatchingAdmissionReviewVersion(java.util.function.Predicate<java.lang.String> predicate) {
        for (java.lang.String item: admissionReviewVersions) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withAdmissionReviewVersions(java.util.List<java.lang.String> admissionReviewVersions) {
        if (this.admissionReviewVersions != null) { _visitables.get("admissionReviewVersions").removeAll(this.admissionReviewVersions);}
        if (admissionReviewVersions != null) {this.admissionReviewVersions = new java.util.ArrayList<java.lang.String>(); for (java.lang.String item : admissionReviewVersions){this.addToAdmissionReviewVersions(item);}} else { this.admissionReviewVersions = null;} return (A) this;
    }

    public A withAdmissionReviewVersions(java.lang.String... admissionReviewVersions) {
        if (this.admissionReviewVersions != null) {this.admissionReviewVersions.clear();}
        if (admissionReviewVersions != null) {for (java.lang.String item :admissionReviewVersions){ this.addToAdmissionReviewVersions(item);}} return (A) this;
    }

    public java.lang.Boolean hasAdmissionReviewVersions() {
        return admissionReviewVersions != null && !admissionReviewVersions.isEmpty();
    }

    public A addNewAdmissionReviewVersion(java.lang.String original) {
        return (A)addToAdmissionReviewVersions(new String(original));
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildClientConfig instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfig getClientConfig() {
        return this.clientConfig!=null?this.clientConfig.build():null;
    }

    public io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfig buildClientConfig() {
        return this.clientConfig!=null?this.clientConfig.build():null;
    }

    public A withClientConfig(io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfig clientConfig) {
        _visitables.get("clientConfig").remove(this.clientConfig);
        if (clientConfig!=null){ this.clientConfig= new io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfigBuilder(clientConfig); _visitables.get("clientConfig").add(this.clientConfig);} return (A) this;
    }

    public java.lang.Boolean hasClientConfig() {
        return this.clientConfig != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ClientConfigNested<A> withNewClientConfig() {
        return new io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluentImpl.ClientConfigNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ClientConfigNested<A> withNewClientConfigLike(io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfig item) {
        return new io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluentImpl.ClientConfigNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ClientConfigNested<A> editClientConfig() {
        return withNewClientConfigLike(getClientConfig());
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ClientConfigNested<A> editOrNewClientConfig() {
        return withNewClientConfigLike(getClientConfig() != null ? getClientConfig(): new io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfigBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ClientConfigNested<A> editOrNewClientConfigLike(io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfig item) {
        return withNewClientConfigLike(getClientConfig() != null ? getClientConfig(): item);
    }

    public java.lang.String getFailurePolicy() {
        return this.failurePolicy;
    }

    public A withFailurePolicy(java.lang.String failurePolicy) {
        this.failurePolicy=failurePolicy; return (A) this;
    }

    public java.lang.Boolean hasFailurePolicy() {
        return this.failurePolicy != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFailurePolicy instead.
     */
        public A withNewFailurePolicy(java.lang.String original) {
        return (A)withFailurePolicy(new String(original));
    }

    public java.lang.String getMatchPolicy() {
        return this.matchPolicy;
    }

    public A withMatchPolicy(java.lang.String matchPolicy) {
        this.matchPolicy=matchPolicy; return (A) this;
    }

    public java.lang.Boolean hasMatchPolicy() {
        return this.matchPolicy != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withMatchPolicy instead.
     */
        public A withNewMatchPolicy(java.lang.String original) {
        return (A)withMatchPolicy(new String(original));
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

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildNamespaceSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getNamespaceSelector() {
        return this.namespaceSelector!=null?this.namespaceSelector.build():null;
    }

    public io.kubernetes.client.openapi.models.V1LabelSelector buildNamespaceSelector() {
        return this.namespaceSelector!=null?this.namespaceSelector.build():null;
    }

    public A withNamespaceSelector(io.kubernetes.client.openapi.models.V1LabelSelector namespaceSelector) {
        _visitables.get("namespaceSelector").remove(this.namespaceSelector);
        if (namespaceSelector!=null){ this.namespaceSelector= new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(namespaceSelector); _visitables.get("namespaceSelector").add(this.namespaceSelector);} return (A) this;
    }

    public java.lang.Boolean hasNamespaceSelector() {
        return this.namespaceSelector != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelector() {
        return new io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluentImpl.NamespaceSelectorNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.NamespaceSelectorNested<A> withNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return new io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluentImpl.NamespaceSelectorNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.NamespaceSelectorNested<A> editNamespaceSelector() {
        return withNewNamespaceSelectorLike(getNamespaceSelector());
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelector() {
        return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.NamespaceSelectorNested<A> editOrNewNamespaceSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return withNewNamespaceSelectorLike(getNamespaceSelector() != null ? getNamespaceSelector(): item);
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildObjectSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getObjectSelector() {
        return this.objectSelector!=null?this.objectSelector.build():null;
    }

    public io.kubernetes.client.openapi.models.V1LabelSelector buildObjectSelector() {
        return this.objectSelector!=null?this.objectSelector.build():null;
    }

    public A withObjectSelector(io.kubernetes.client.openapi.models.V1LabelSelector objectSelector) {
        _visitables.get("objectSelector").remove(this.objectSelector);
        if (objectSelector!=null){ this.objectSelector= new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(objectSelector); _visitables.get("objectSelector").add(this.objectSelector);} return (A) this;
    }

    public java.lang.Boolean hasObjectSelector() {
        return this.objectSelector != null;
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelector() {
        return new io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluentImpl.ObjectSelectorNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ObjectSelectorNested<A> withNewObjectSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return new io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluentImpl.ObjectSelectorNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ObjectSelectorNested<A> editObjectSelector() {
        return withNewObjectSelectorLike(getObjectSelector());
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ObjectSelectorNested<A> editOrNewObjectSelector() {
        return withNewObjectSelectorLike(getObjectSelector() != null ? getObjectSelector(): new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder().build());
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ObjectSelectorNested<A> editOrNewObjectSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item) {
        return withNewObjectSelectorLike(getObjectSelector() != null ? getObjectSelector(): item);
    }

    public java.lang.String getReinvocationPolicy() {
        return this.reinvocationPolicy;
    }

    public A withReinvocationPolicy(java.lang.String reinvocationPolicy) {
        this.reinvocationPolicy=reinvocationPolicy; return (A) this;
    }

    public java.lang.Boolean hasReinvocationPolicy() {
        return this.reinvocationPolicy != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withReinvocationPolicy instead.
     */
        public A withNewReinvocationPolicy(java.lang.String original) {
        return (A)withReinvocationPolicy(new String(original));
    }

    public A addToRules(int index,io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder builder = new io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder(item);_visitables.get("rules").add(index >= 0 ? index : _visitables.get("rules").size(), builder);this.rules.add(index >= 0 ? index : rules.size(), builder); return (A)this;
    }

    public A setToRules(int index,io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder>();}
        io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder builder = new io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder(item);
        if (index < 0 || index >= _visitables.get("rules").size()) { _visitables.get("rules").add(builder); } else { _visitables.get("rules").set(index, builder);}
        if (index < 0 || index >= rules.size()) { rules.add(builder); } else { rules.set(index, builder);}
         return (A)this;
    }

    public A addToRules(io.kubernetes.client.openapi.models.V1beta1RuleWithOperations... items) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item : items) {io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder builder = new io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
    }

    public A addAllToRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1RuleWithOperations> items) {
        if (this.rules == null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder>();}
        for (io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item : items) {io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder builder = new io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder(item);_visitables.get("rules").add(builder);this.rules.add(builder);} return (A)this;
    }

    public A removeFromRules(io.kubernetes.client.openapi.models.V1beta1RuleWithOperations... items) {
        for (io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item : items) {io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder builder = new io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    public A removeAllFromRules(java.util.Collection<io.kubernetes.client.openapi.models.V1beta1RuleWithOperations> items) {
        for (io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item : items) {io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder builder = new io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder(item);_visitables.get("rules").remove(builder);if (this.rules != null) {this.rules.remove(builder);}} return (A)this;
    }

    public A removeMatchingFromRules(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder> predicate) {
        if (rules == null) return (A) this;
        final Iterator<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder> each = rules.iterator();
        final List visitables = _visitables.get("rules");
        while (each.hasNext()) {
          io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder builder = each.next();
          if (predicate.test(builder)) {
            visitables.remove(builder);
            each.remove();
          }
        }
        return (A)this;
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildRules instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1beta1RuleWithOperations> getRules() {
        return build(rules);
    }

    public java.util.List<io.kubernetes.client.openapi.models.V1beta1RuleWithOperations> buildRules() {
        return build(rules);
    }

    public io.kubernetes.client.openapi.models.V1beta1RuleWithOperations buildRule(int index) {
        return this.rules.get(index).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1RuleWithOperations buildFirstRule() {
        return this.rules.get(0).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1RuleWithOperations buildLastRule() {
        return this.rules.get(rules.size() - 1).build();
    }

    public io.kubernetes.client.openapi.models.V1beta1RuleWithOperations buildMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder item: rules) { if(predicate.test(item)){ return item.build();} } return null;
    }

    public java.lang.Boolean hasMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder> predicate) {
        for (io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder item: rules) { if(predicate.test(item)){ return true;} } return false;
    }

    public A withRules(java.util.List<io.kubernetes.client.openapi.models.V1beta1RuleWithOperations> rules) {
        if (this.rules != null) { _visitables.get("rules").removeAll(this.rules);}
        if (rules != null) {this.rules = new java.util.ArrayList<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder>(); for (io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item : rules){this.addToRules(item);}} else { this.rules = null;} return (A) this;
    }

    public A withRules(io.kubernetes.client.openapi.models.V1beta1RuleWithOperations... rules) {
        if (this.rules != null) {this.rules.clear();}
        if (rules != null) {for (io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item :rules){ this.addToRules(item);}} return (A) this;
    }

    public java.lang.Boolean hasRules() {
        return rules != null && !rules.isEmpty();
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.RulesNested<A> addNewRule() {
        return new io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluentImpl.RulesNestedImpl();
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.RulesNested<A> addNewRuleLike(io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item) {
        return new io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluentImpl.RulesNestedImpl(-1, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.RulesNested<A> setNewRuleLike(int index,io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item) {
        return new io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluentImpl.RulesNestedImpl(index, item);
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.RulesNested<A> editRule(int index) {
        if (rules.size() <= index) throw new RuntimeException("Can't edit rules. Index exceeds size.");
        return setNewRuleLike(index, buildRule(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.RulesNested<A> editFirstRule() {
        if (rules.size() == 0) throw new RuntimeException("Can't edit first rules. The list is empty.");
        return setNewRuleLike(0, buildRule(0));
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.RulesNested<A> editLastRule() {
        int index = rules.size() - 1;
        if (index < 0) throw new RuntimeException("Can't edit last rules. The list is empty.");
        return setNewRuleLike(index, buildRule(index));
    }

    public io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.RulesNested<A> editMatchingRule(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder> predicate) {
        int index = -1;
        for (int i=0;i<rules.size();i++) { 
        if (predicate.test(rules.get(i))) {index = i; break;}
        } 
        if (index < 0) throw new RuntimeException("Can't edit matching rules. No match found.");
        return setNewRuleLike(index, buildRule(index));
    }

    public java.lang.String getSideEffects() {
        return this.sideEffects;
    }

    public A withSideEffects(java.lang.String sideEffects) {
        this.sideEffects=sideEffects; return (A) this;
    }

    public java.lang.Boolean hasSideEffects() {
        return this.sideEffects != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withSideEffects instead.
     */
        public A withNewSideEffects(java.lang.String original) {
        return (A)withSideEffects(new String(original));
    }

    public java.lang.Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public A withTimeoutSeconds(java.lang.Integer timeoutSeconds) {
        this.timeoutSeconds=timeoutSeconds; return (A) this;
    }

    public java.lang.Boolean hasTimeoutSeconds() {
        return this.timeoutSeconds != null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        V1beta1MutatingWebhookFluentImpl that = (V1beta1MutatingWebhookFluentImpl) o;
        if (admissionReviewVersions != null ? !admissionReviewVersions.equals(that.admissionReviewVersions) :that.admissionReviewVersions != null) return false;
        if (clientConfig != null ? !clientConfig.equals(that.clientConfig) :that.clientConfig != null) return false;
        if (failurePolicy != null ? !failurePolicy.equals(that.failurePolicy) :that.failurePolicy != null) return false;
        if (matchPolicy != null ? !matchPolicy.equals(that.matchPolicy) :that.matchPolicy != null) return false;
        if (name != null ? !name.equals(that.name) :that.name != null) return false;
        if (namespaceSelector != null ? !namespaceSelector.equals(that.namespaceSelector) :that.namespaceSelector != null) return false;
        if (objectSelector != null ? !objectSelector.equals(that.objectSelector) :that.objectSelector != null) return false;
        if (reinvocationPolicy != null ? !reinvocationPolicy.equals(that.reinvocationPolicy) :that.reinvocationPolicy != null) return false;
        if (rules != null ? !rules.equals(that.rules) :that.rules != null) return false;
        if (sideEffects != null ? !sideEffects.equals(that.sideEffects) :that.sideEffects != null) return false;
        if (timeoutSeconds != null ? !timeoutSeconds.equals(that.timeoutSeconds) :that.timeoutSeconds != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(admissionReviewVersions,  clientConfig,  failurePolicy,  matchPolicy,  name,  namespaceSelector,  objectSelector,  reinvocationPolicy,  rules,  sideEffects,  timeoutSeconds,  super.hashCode());
    }

    public class ClientConfigNestedImpl<N> extends io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfigFluentImpl<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ClientConfigNested<N>> implements io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ClientConfigNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfigBuilder builder;

            ClientConfigNestedImpl(io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfig item) {
                this.builder = new io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfigBuilder(this, item);
                        
            }

            ClientConfigNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.AdmissionregistrationV1beta1WebhookClientConfigBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1MutatingWebhookFluentImpl.this.withClientConfig(builder.build());
            }

            public N endClientConfig() {
                return and();
            }
    }


    public class NamespaceSelectorNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.NamespaceSelectorNested<N>> implements io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.NamespaceSelectorNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

            NamespaceSelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
                        
            }

            NamespaceSelectorNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1MutatingWebhookFluentImpl.this.withNamespaceSelector(builder.build());
            }

            public N endNamespaceSelector() {
                return and();
            }
    }


    public class ObjectSelectorNestedImpl<N> extends io.kubernetes.client.openapi.models.V1LabelSelectorFluentImpl<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ObjectSelectorNested<N>> implements io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.ObjectSelectorNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1LabelSelectorBuilder builder;

            ObjectSelectorNestedImpl(io.kubernetes.client.openapi.models.V1LabelSelector item) {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this, item);
                        
            }

            ObjectSelectorNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.V1LabelSelectorBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1MutatingWebhookFluentImpl.this.withObjectSelector(builder.build());
            }

            public N endObjectSelector() {
                return and();
            }
    }


    public class RulesNestedImpl<N> extends io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsFluentImpl<io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.RulesNested<N>> implements io.kubernetes.client.openapi.models.V1beta1MutatingWebhookFluent.RulesNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder builder;
        private final int index;

            RulesNestedImpl(int index,io.kubernetes.client.openapi.models.V1beta1RuleWithOperations item) {
                this.index = index;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder(this, item);
                        
            }

            RulesNestedImpl() {
                this.index = -1;
                this.builder = new io.kubernetes.client.openapi.models.V1beta1RuleWithOperationsBuilder(this);
                        
            }

            public N and() {
                return (N) V1beta1MutatingWebhookFluentImpl.this.setToRules(index,builder.build());
            }

            public N endRule() {
                return and();
            }
    }


}

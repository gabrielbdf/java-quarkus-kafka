package io.kerno.dto;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SpecDto {

    public String name;
    public String namespace;
    public String resourceVersion;
    public String uid;
    public String generateName;
    public String progressDeadlineSeconds;
    public int replicas;
    public String revisionHistoryLimit;
    public Map<String, Object> selector;
    public Map<String, Object> strategy;
    public TemplateDto template;
    public String podManagementPolicy;
    public String serviceName;
    public Map<String, Object> updateStrategy;
    public List<Object> containers;
    public String dnsPolicy;
    public String enableServiceLinks;
    public Map<String, Object> nodeSelector;
    public String nodeName;
    public String preemptionPolicy;
    public String priority;
    public String restartPolicy;
    public String schedulerName;
    public Map<String, Object> securityContext;
    public String serviceAccount;
    public String serviceAccountName;
    public String terminationGracePeriodSeconds;
    public List<Object> tolerations;
    public List<Object> volumes;
    public String hostname;
    public String subdomain;
    public String clusterIP;
    public List<String> clusterIPs;
    public String internalTrafficPolicy;
    public List<String> ipFamilies;
    public String ipFamilyPolicy;
    public List<Object> ports;
    public String sessionAffinity;
    public String type;
    public String externalTrafficPolicy;
    public List<Object> rules;

}

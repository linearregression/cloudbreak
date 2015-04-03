package com.sequenceiq.cloudbreak.core.flow;

public enum FlowPhases {
    PROVISIONING_SETUP,
    PROVISIONING,
    METADATA_SETUP,
    METADATA_FINALIZE,
    AMBARI_ROLE_ALLOCATION,
    CLUSTER_SETUP,
    AMBARI_START,
    CLUSTER_CREATION,
    CLUSTER_RESET,
    ENABLE_KERBEROS,
    STACK_CREATION_FAILED,
    STACK_START,
    STACK_STATUS_UPDATE_FAILED,
    STACK_STOP,
    STACK_UPSCALE,
    STACK_DOWNSCALE,
    CLUSTER_START,
    CLUSTER_STATUS_UPDATE_FAILED,
    CLUSTER_STOP,
    CLUSTER_PREPARE_UPSCALE,
    CLUSTER_UPSCALE,
    CLUSTER_DOWNSCALE,
    TERMINATION,
    TERMINATION_FAILED,
    UPDATE_ALLOWED_SUBNETS,
    CLUSTER_UPSCALE_SETUP_NODES,
    NONE;
}

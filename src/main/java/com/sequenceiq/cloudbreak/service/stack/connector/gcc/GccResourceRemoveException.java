package com.sequenceiq.cloudbreak.service.stack.connector.gcc;

import com.sequenceiq.cloudbreak.controller.InternalServerException;
import com.sequenceiq.cloudbreak.domain.ResourceType;

public class GccResourceRemoveException extends InternalServerException {
    public GccResourceRemoveException(String message) {
        super(message);
    }

    public GccResourceRemoveException(String message, ResourceType resourceType, String name) {
        super(String.format("%s: exception occured on %s resource with %s resourceType", message, resourceType.name(), name));
    }
}

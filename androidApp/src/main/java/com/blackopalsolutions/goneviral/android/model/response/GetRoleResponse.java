package com.blackopalsolutions.goneviral.android.model.response;

import com.blackopalsolutions.goneviral.android.model.domain.Role;

public class GetRoleResponse extends Response {
    private final Role role;

    public GetRoleResponse(Role role) {
        super(true);
        this.role = role;
    }

    public GetRoleResponse(String message) {
        super(message);
        role = null;
    }

    public Role getRole() {
        return role;
    }
}

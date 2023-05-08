package com.ap.interfacemethod;

import java.io.Serializable;

public interface GrantedAuthority extends Serializable {

    String getAuthority();
}

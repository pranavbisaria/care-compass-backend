package com.carecompass.payloads;

public record GoogleSignModel (
    String email,
    String picture,
    String given_name,
    String family_name,
    String iss,
    String azp,
    Long exp
){}
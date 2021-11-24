package org.hcl.poc.springdemo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PocResponse {
    int id;
    java.util.Date time;
    String name, hostname;
}

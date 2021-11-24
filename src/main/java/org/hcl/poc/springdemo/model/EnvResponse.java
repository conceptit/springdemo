package org.hcl.poc.springdemo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class EnvResponse {
 Map<String,String> env ;
}

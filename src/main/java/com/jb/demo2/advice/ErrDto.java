package com.jb.demo2.advice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by kobis on 14 Mar, 2023
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrDto {
    private final String key = "Cat System LTD";
    private String value;
}

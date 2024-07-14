package com.aline.forum.records;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TopicoRecord(
        @NotNull
        @NotBlank
        String titulo,

        @NotNull
        @NotBlank
        String mensagem
) {
}

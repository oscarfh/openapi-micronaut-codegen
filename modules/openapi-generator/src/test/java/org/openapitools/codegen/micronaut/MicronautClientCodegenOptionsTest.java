package org.openapitools.codegen.micronaut;

import org.openapitools.codegen.AbstractOptionsTest;
import org.openapitools.codegen.CodegenConfig;
import org.openapitools.codegen.languages.MicronautClientCodegen;
import org.openapitools.codegen.options.MicronautClientCodegenOptionsProvider;

import mockit.Expectations;
import mockit.Tested;

public class MicronautClientCodegenOptionsTest extends AbstractOptionsTest {

    @Tested
    private MicronautClientCodegen codegen;

    public MicronautClientCodegenOptionsTest() {
        super(new MicronautClientCodegenOptionsProvider());
    }

    @Override
    protected CodegenConfig getCodegenConfig() {
        return codegen;
    }

    @SuppressWarnings("unused")
    @Override
    protected void setExpectations() {
        // TODO: Complete options
        new Expectations(codegen) {{

        }};
    }
}


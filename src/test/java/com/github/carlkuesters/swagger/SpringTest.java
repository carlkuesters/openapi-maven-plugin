package com.github.carlkuesters.swagger;

import com.github.carlkuesters.swagger.config.Framework;

public class SpringTest extends FrameworkTest {

    public SpringTest() {
        super(Framework.spring);
    }

    public void testGenerateFiles() throws Exception {
        // Given
        GenerateMojo mojo = createGenerateMojo();

        // When
        mojo.execute();

        // Then
        assetGeneratedFile_Json();
        assetGeneratedFile_Yaml();
    }
}
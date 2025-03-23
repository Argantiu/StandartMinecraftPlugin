## interfaces / api

Here you can add additional interfaces that set structure rules to your plugin.  
These interfaces might also be used by other plugins, please add the most of code documentation here.
  
#### File and class naming:  
```
iFolderFunction.java
```
`i` = Shows others, that this file is a interface  
`Folder` = The folder that the interface is most used in  
`Function` = What function the interface mainly implements  

## Content example
```java
package com.username.plugintemplate.api;

import com.username.plugintemplate.exeptions.ErrorStatement;
import java.*;

/**
 * @author username
 * @since 2025-01-01
 */

public interface iFolderFunction {

    /**
     * @param test Test description of what the value content should be
     * @return What the method returns; in this case a {@code text}
     * @throws ErrorStatement If an error happens this class will be called
     */
    public String myMethod(String test) throws ErrorStatement;
}
```
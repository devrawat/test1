#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.core.resource;

import org.springframework.stereotype.Component;

@Component
public class BeanThree extends BeanTwo {
    public String printMessage() {
        return " * Bean Three * ";
    }
}

package com.structurizr.component.matcher;

import com.structurizr.component.Type;
import org.apache.bcel.classfile.JavaClass;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Set;

/**
 * Matches types where the type implements the specified interface.
 */
public class ImplementsTypeMatcher extends AbstractTypeMatcher {

    private static final Log log = LogFactory.getLog(ImplementsTypeMatcher.class);

    private final String interfaceName;

    public ImplementsTypeMatcher(String interfaceName, String technology) {
        super(technology);

        this.interfaceName = interfaceName;
    }

    @Override
    public boolean matches(Type type) {
        JavaClass javaClass = type.getJavaClass();
        Set<String> interfaceNames = Set.of(javaClass.getInterfaceNames());
        return interfaceNames.contains(interfaceName);
    }

    @Override
    public String toString() {
        return "ImplementsTypeMatcher{" +
                "interfaceName='" + interfaceName + '\'' +
                '}';
    }

}
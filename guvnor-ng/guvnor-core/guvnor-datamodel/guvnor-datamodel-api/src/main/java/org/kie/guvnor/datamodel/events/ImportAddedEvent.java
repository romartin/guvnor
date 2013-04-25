package org.kie.guvnor.datamodel.events;

import org.drools.guvnor.models.commons.shared.imports.Import;
import org.kie.commons.validation.PortablePreconditions;
import org.kie.guvnor.datamodel.oracle.PackageDataModelOracle;

/**
 * An event signalling adding an import
 */
public class ImportAddedEvent {

    private final Import item;
    private final PackageDataModelOracle oracle;

    public ImportAddedEvent( final PackageDataModelOracle oracle,
                             final Import item ) {
        this.oracle = PortablePreconditions.checkNotNull( "oracle",
                                                          oracle );
        this.item = PortablePreconditions.checkNotNull( "item",
                                                        item );
    }

    public Import getImport() {
        return this.item;
    }

    public PackageDataModelOracle getDataModelOracle() {
        return this.oracle;
    }

}

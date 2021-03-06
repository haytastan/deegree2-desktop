//$HeadURL$
/*----------------    FILE HEADER  ------------------------------------------
 This file is part of deegree.
 Copyright (C) 2001-2008 by:
 Department of Geography, University of Bonn
 http://www.giub.uni-bonn.de/deegree/
 lat/lon GmbH
 http://www.lat-lon.de

 This library is free software; you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public
 License as published by the Free Software Foundation; either
 version 2.1 of the License, or (at your option) any later version.
 This library is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 Lesser General Public License for more details.
 You should have received a copy of the GNU Lesser General Public
 License along with this library; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 Contact:

 Andreas Poth
 lat/lon GmbH
 Aennchenstr. 19
 53177 Bonn
 Germany
 E-Mail: poth@lat-lon.de

 Prof. Dr. Klaus Greve
 Department of Geography
 University of Bonn
 Meckenheimer Allee 166
 53115 Bonn
 Germany
 E-Mail: greve@giub.uni-bonn.de
 ---------------------------------------------------------------------------*/

package org.deegree.model;

import java.io.Serializable;
import java.net.URI;
import java.util.UUID;

import org.deegree.framework.util.StringTools;
import org.deegree.framework.utils.HashCodeUtil;

/**
 * TODO add Class description
 * 
 * @author <a href="mailto:wanhoff@lat-lon.de">Jeronimo Wanhoff</a>
 * @author <a href="mailto:poth@lat-lon.de">Andreas Poth</a>
 * @author last edited by: $Author$
 * 
 * @version. $Revision$, $Date$
 */
public class Identifier implements Serializable {

    private static final long serialVersionUID = -3453223228042816310L;

    private String value;

    private URI namespace;

    /**
     * creates a default Identfier by using a random UUID as value and "http://www.deegree.org" as namespace URI
     * 
     */
    public Identifier() {
        this.value = UUID.randomUUID().toString();
        this.namespace = URI.create( "http://www.deegree.org" );
    }

    /**
     * 
     * @param value
     */
    public Identifier( String value ) {
        this.value = value;
    }

    /**
     * 
     * @param value
     * @param namespace
     */
    public Identifier( String value, URI namespace ) {
        this.value = value;
        this.namespace = namespace;
    }

    /**
     * 
     * @return identifier namespace; maybe <code>null</code>
     */
    public URI getNamespace() {
        return this.namespace;
    }

    /**
     * 
     * @return
     */
    public String getValue() {
        return this.value;
    }

    @Override
    public boolean equals( Object other ) {
        if ( other == null || !( other instanceof Identifier ) ) {
            return false;
        }
        Identifier id = (Identifier) other;
        if ( this.namespace != null && id.getNamespace() != null ) {
            if ( this.namespace.equals( id.getNamespace() ) && ( this.value.equals( id.getValue() ) ) ) {
                return true;
            }
        } else if ( this.namespace == null && id.getNamespace() == null && this.value.equals( id.getValue() ) ) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash( result, value );
        result = HashCodeUtil.hash( result, namespace );
        return result;
    }

    /**
     * 
     * @return {$namespace$}:$value or if namespace == null just $value$
     */
    public String getAsQualifiedString() {
        if ( namespace != null ) {
            return StringTools.concat( 200, '{', namespace.toASCIIString(), "}:", value );
        } else {
            return value;
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if ( this.namespace != null ) {
            sb.append( "Namespace: " );
            sb.append( this.namespace ).append( ' ' );
        }
        sb.append( "Value: " );
        sb.append( this.value );
        return sb.toString();
    }
}

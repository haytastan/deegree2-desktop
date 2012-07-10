/*----------------    FILE HEADER  ------------------------------------------
 This file is part of deegree.
 Copyright (C) 2001-2007 by:
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

package org.deegree.igeo.views.swing.addlayer;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import org.deegree.datatypes.QualifiedName;

/**
 * The <code>QualifiedNameRenderer</code> renders a QualifiedName as entry in a comboBox.
 * 
 * @author <a href="mailto:buesching@lat-lon.de">Lyn Buesching</a>
 * @author last edited by: $Author:$
 * 
 * @version $Revision:$, $Date:$
 * 
 */
public class QualifiedNameRenderer extends JLabel implements ListCellRenderer {

    private static final long serialVersionUID = 3802091417669850354L;

    public QualifiedNameRenderer() {
        setPreferredSize( new Dimension( 200, 18 ) );
        setBorder( BorderFactory.createEmptyBorder( 0, 2, 0, 0 ) );
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing.JList,
     *      java.lang.Object, int, boolean, boolean)
     */
    public Component getListCellRendererComponent( JList list, Object value, int index, boolean isSelected,
                                                   boolean cellHasFocus ) {
        QualifiedName qn = (QualifiedName) value;
        if ( qn != null ) {
            setText( qn.getLocalName() );
            setToolTipText( qn.getFormattedString() );
        }
        return this;
    }
}

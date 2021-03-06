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

package org.deegree.igeo.views.swing.style.renderer;

import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;

import org.deegree.igeo.style.model.SldProperty;

/**
 * <code>SldPropertyCellRenderer</code>
 * 
 * @author <a href="mailto:buesching@lat-lon.de">Lyn Buesching</a>
 * @author last edited by: $Author$
 * 
 * @version $Revision$, $Date$
 * 
 */
public class SldPropertyCellRenderer extends JLabel implements TableCellRenderer {

    private static final long serialVersionUID = 4610212837294619988L;

    private Border unselectedBorder = null;

    private Border selectedBorder = null;

    /*
     * (non-Javadoc)
     * 
     * @see javax.swing.table.TableCellRenderer#getTableCellRendererComponent(javax.swing.JTable,
     * java.lang.Object, boolean, boolean, int, int)
     */
    public Component getTableCellRendererComponent( JTable table, Object value, boolean isSelected, boolean hasFocus,
                                                    int row, int column ) {
        if ( isSelected ) {
            if ( selectedBorder == null ) {
                selectedBorder = BorderFactory.createMatteBorder( 2, 5, 2, 5, table.getSelectionBackground() );
            }
            setBorder( selectedBorder );
        } else {
            if ( unselectedBorder == null ) {
                unselectedBorder = BorderFactory.createMatteBorder( 2, 5, 2, 5, table.getBackground() );
            }
            setBorder( unselectedBorder );
        }
        if ( value instanceof SldProperty ) {
            SldProperty sldProperty = (SldProperty) value;
            setText( sldProperty.getName() );
        } else {
            setText( (String) value );
        }
        return this;
    }

}

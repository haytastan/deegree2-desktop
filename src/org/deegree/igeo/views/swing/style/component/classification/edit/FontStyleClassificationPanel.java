//$HeadURL: svn+ssh://lbuesching@svn.wald.intevation.de/deegree/base/trunk/resources/eclipse/files_template.xml $
/*----------------------------------------------------------------------------
 This file is part of deegree, http://deegree.org/
 Copyright (C) 2001-2010 by:
 - Department of Geography, University of Bonn -
 and
 - lat/lon GmbH -

 This library is free software; you can redistribute it and/or modify it under
 the terms of the GNU Lesser General Public License as published by the Free
 Software Foundation; either version 2.1 of the License, or (at your option)
 any later version.
 This library is distributed in the hope that it will be useful, but WITHOUT
 ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 details.
 You should have received a copy of the GNU Lesser General Public License
 along with this library; if not, write to the Free Software Foundation, Inc.,
 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA

 Contact information:

 lat/lon GmbH
 Aennchenstr. 19, 53177 Bonn
 Germany
 http://lat-lon.de/

 Department of Geography, University of Bonn
 Prof. Dr. Klaus Greve
 Postfach 1147, 53001 Bonn
 Germany
 http://www.geographie.uni-bonn.de/deegree/

 e-mail: info@deegree.org
 ----------------------------------------------------------------------------*/
package org.deegree.igeo.views.swing.style.component.classification.edit;

import static org.deegree.igeo.i18n.Messages.get;


import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.deegree.datatypes.QualifiedName;
import org.deegree.igeo.views.swing.style.component.font.FontHelper;
import org.deegree.igeo.views.swing.style.renderer.PropertyNameRenderer;
import org.deegree.model.filterencoding.PropertyName;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * TODO add class documentation here
 * 
 * @author <a href="mailto:buesching@lat-lon.de">Lyn Buesching</a>
 * @author last edited by: $Author: lyn $
 * 
 * @version $Revision: $, $Date: $
 */
public class FontStyleClassificationPanel extends JPanel {

    private static final long serialVersionUID = 517995187354706478L;

    private JComboBox propertyCB;

    private JRadioButton fixed;

    private JRadioButton property;

    private JComboBox fixedCB;

    private String title;

    public FontStyleClassificationPanel( Object fontFamily, String title, List<QualifiedName> properties ) {
        this.title = title;

        fixed = new JRadioButton();
        property = new JRadioButton();

        ButtonGroup bg = new ButtonGroup();
        bg.add( fixed );
        bg.add( property );

        propertyCB = new JComboBox();
        propertyCB.setRenderer( new PropertyNameRenderer() );
        for ( QualifiedName qn : properties ) {
            propertyCB.addItem( new PropertyName( qn ) );
        }
        FontHelper ffh = new FontHelper();
        fixedCB = ffh.createFontStyleChooser();
        if ( fontFamily instanceof PropertyName ) {
            property.setSelected( true );
            propertyCB.setSelectedItem( fontFamily );
        } else {
            fixed.setSelected( true );
            fixedCB.setSelectedItem( fontFamily );
        }

        FormLayout fl = new FormLayout( "$rgap, 15dlu, left:default:grow(1.0)",
                                        "$sepheight, center:[20dlu,default], $ug, $sepheight , center:$cpheight" );
        DefaultFormBuilder builder = new DefaultFormBuilder( fl );
        CellConstraints cc = new CellConstraints();
        builder.addSeparator( get( "$MD11690" ), cc.xyw( 1, 1, 3 ) );
        builder.add( fixed, cc.xy( 2, 2 ) );
        builder.add( fixedCB, cc.xy( 3, 2 ) );

        builder.addSeparator( get( "$MD11691" ), cc.xyw( 1, 4, 3 ) );
        builder.add( property, cc.xy( 2, 5 ) );
        builder.add( propertyCB, cc.xy( 3, 5 ) );
        add( builder.getPanel() );

    }

    public Object getValue() {
        if ( property.isSelected() ) {
            return (PropertyName) propertyCB.getSelectedItem();
        } else {
            return fixedCB.getSelectedItem();
        }
    }

    @Override
    public String toString() {
        return title;
    }
}

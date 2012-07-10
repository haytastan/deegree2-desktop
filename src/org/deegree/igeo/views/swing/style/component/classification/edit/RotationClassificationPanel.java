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
import org.deegree.igeo.views.swing.style.component.placement.RotationEditor;
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
public class RotationClassificationPanel extends JPanel {

    private static final long serialVersionUID = -7866083117355936515L;

    private JComboBox propertyCB;

    private JRadioButton fixed;

    private JRadioButton property;

    private String title;

    private RotationEditor rotationEditor;

    public RotationClassificationPanel( Object rotation, String title, List<QualifiedName> properties ) {
        this.title = title;

        fixed = new JRadioButton();
        property = new JRadioButton();

        ButtonGroup bg = new ButtonGroup();
        bg.add( fixed );
        bg.add( property );

        propertyCB = new JComboBox();
        propertyCB.setRenderer( new PropertyNameRenderer() );
        for ( QualifiedName pn : properties ) {
            propertyCB.addItem( new PropertyName( pn ) );
        }

        rotationEditor = new RotationEditor();
        if ( rotation instanceof PropertyName ) {
            property.setSelected( true );
            propertyCB.setSelectedItem( rotation );
        } else if ( rotation instanceof Double ) {
            fixed.setSelected( true );
            rotationEditor.setValue( (Double) rotation );
        } else {
            fixed.setSelected( true );
        }
        if ( properties == null || properties.isEmpty() ) {
            propertyCB.setEnabled( false );
            property.setEnabled( false );
        }

        FormLayout fl = new FormLayout( "$rgap, 15dlu, left:default:grow(1.0)",
                                        "$sepheight, center:[20dlu,default], $ug, $sepheight , center:$cpheight" );
        DefaultFormBuilder builder = new DefaultFormBuilder( fl );
        CellConstraints cc = new CellConstraints();
        builder.addSeparator( get( "$MD11711" ), cc.xyw( 1, 1, 3 ) );
        builder.add( fixed, cc.xy( 2, 2 ) );
        builder.add( rotationEditor, cc.xy( 3, 2 ) );

        builder.addSeparator( get( "$MD11712" ), cc.xyw( 1, 4, 3 ) );
        builder.add( property, cc.xy( 2, 5 ) );
        builder.add( propertyCB, cc.xy( 3, 5 ) );
        add( builder.getPanel() );

    }

    public Object getValue() {
        if ( property.isSelected() ) {
            return (PropertyName) propertyCB.getSelectedItem();
        } else {
            return rotationEditor.getValue();
        }
    }

    @Override
    public String toString() {
        return title;
    }
}

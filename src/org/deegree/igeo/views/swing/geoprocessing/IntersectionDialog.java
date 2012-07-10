//$HeadURL: svn+ssh://developername@svn.wald.intevation.org/deegree/base/trunk/resources/eclipse/files_template.xml $
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

package org.deegree.igeo.views.swing.geoprocessing;

import java.awt.BorderLayout;

import org.deegree.datatypes.QualifiedName;
import org.deegree.igeo.commands.geoprocessing.LayerIntersectionCommand.INTERSECTION_TYPE;
import org.deegree.igeo.config.ViewFormType;
import org.deegree.igeo.mapmodel.Layer;
import org.deegree.igeo.views.swing.DefaultDialog;

/**
 * The <code></code> class TODO add class documentation here.
 * 
 * @author <a href="mailto:poth@lat-lon.de">Andreas Poth</a>
 * 
 * @author last edited by: $Author: Andreas Poth $
 * 
 * @version $Revision: $, $Date: $
 * 
 */
public class IntersectionDialog extends DefaultDialog implements IntersectionModel {

    private static final long serialVersionUID = 3014394697139436115L;

    private IntersectionPanel ip;

    /**
     * 
     */
    public IntersectionDialog() {
        setLayout( new BorderLayout() );
        ip = new IntersectionPanel( this );
    }

    @Override
    public void init( ViewFormType viewForm )
                            throws Exception {
        super.init( viewForm );
        ip.registerModule( this.owner );
        ip.init( viewForm );
        add( ip, BorderLayout.CENTER );
        setVisible( true );
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.deegree.igeo.views.swing.geoprocessing.IntersectionModel#getCompareLayer()
     */
    public Layer getCompareLayer() {
        return ip.getCompareLayer();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.deegree.igeo.views.swing.geoprocessing.IntersectionModel#getMainLayer()
     */
    public Layer getMainLayer() {
        return ip.getMainLayer();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.deegree.igeo.views.swing.geoprocessing.IntersectionModel#getNewLayerName()
     */
    public String getNewLayerName() {
        return ip.getNewLayerName();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.deegree.igeo.views.swing.geoprocessing.IntersectionModel#getCompareLayerGeometry()
     */
    public QualifiedName getCompareLayerGeometry() {
        return ip.getCompareLayerGeometry();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.deegree.igeo.views.swing.geoprocessing.IntersectionModel#getMainLayerGeometry()
     */
    public QualifiedName getMainLayerGeometry() {
        return ip.getMainLayerGeometry();
    }

    /* (non-Javadoc)
     * @see org.deegree.igeo.views.swing.geoprocessing.IntersectionModel#getIntersectionType()
     */
    public INTERSECTION_TYPE getIntersectionType() {
        return ip.getIntersectionType();
    }

}

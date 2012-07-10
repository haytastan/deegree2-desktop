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

package org.deegree.igeo.dataadapter;

import java.net.URL;
import java.util.List;

import org.deegree.igeo.mapmodel.Layer;
import org.deegree.model.feature.FeatureCollection;

/**
 * Definition of convenience methods for inserting, updating and deleting Features schema of a WFS. These methods are
 * defined within an interface because concrete realization depends on WFS version
 * 
 * @author <a href="mailto:poth@lat-lon.de">Andreas Poth</a>
 * 
 * @author last edited by: $Author: Andreas Poth $
 * 
 * @version $Revision: $, $Date: $
 * 
 */
public interface WFSDataWriter {
    
    /**
     * list if IDs of inserted features
     * @param wfsURL
     * @param featureCollection
     * @param layer
     * @return ids of inserted features
     */
    List<String> insertFeatures(URL wfsURL, FeatureCollection featureCollection, Layer layer );
    
    /**
     * 
     * @param wfsURL
     * @param featureCollection
     * @param layer
     * @return number of features that has been updated
     */
    int updateFeatures(URL wfsURL, FeatureCollection featureCollection, Layer layer );
    
    /**
     * 
     * @param wfsURL
     * @param featureCollection
     * @param layer
     * @return number of features that has been deleted
     */
    int deleteFeatures(URL wfsURL, FeatureCollection featureCollection, Layer layer );

    /**
     * 
     * @param timeout
     *            timeout for accessing WFS
     */
    void setTimeout( int timeout );
}

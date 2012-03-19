package org.openstack.api.compute;

import org.openstack.api.common.RequestBuilder;
import org.openstack.api.common.Resource;
import org.openstack.model.compute.NovaImageList;

public class ImagesResource extends Resource {

    public NovaImageList list(boolean detail) {
    	RequestBuilder r = detail ? resource("detail") : resource();
    	return  r.get(NovaImageList.class);
    }

    public NovaImageList list() {
    	return list(true);
    }

    public ImageResource image(String id) {
        return buildChildResource(id, ImageResource.class);
    }

}
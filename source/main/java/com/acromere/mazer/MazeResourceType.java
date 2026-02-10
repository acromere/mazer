package com.acromere.mazer;

import com.acromere.xenon.Xenon;
import com.acromere.xenon.XenonProgramProduct;
import com.acromere.xenon.resource.Resource;
import com.acromere.xenon.resource.exception.ResourceException;
import com.acromere.xenon.resource.ResourceType;

public class MazeResourceType extends ResourceType {

	public MazeResourceType( XenonProgramProduct product ) {
		super( product, "mazer" );
		setDefaultCodec( new MazeCodec( product ) );
	}

	@Override
	public String getKey() {
		return getDefaultCodec().getKey();
	}

	@Override
	public boolean assetNew( Xenon program, Resource resource ) throws ResourceException {
		return super.assetNew( program, resource );
	}

	@Override
	public boolean assetOpen( Xenon program, Resource resource ) throws ResourceException {
		resource.setModel( new Maze() );
		return true;
	}

}

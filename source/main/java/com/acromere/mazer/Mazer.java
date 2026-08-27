package com.acromere.mazer;

import com.acromere.product.Rb;
import com.acromere.xenon.Module;
import com.acromere.xenon.ToolRegistration;
import lombok.CustomLog;

/**
 * The Mazer mod. This mod is part of an example mod for
 * <a href="https://www.acromere.com/product/xenon">Xenon</a>. The mod
 * demonstrates various capabilities and practices common to Xenon mods.
 */
@CustomLog
public class Mazer extends Module {

	private final MazeResourceType mazeResourceType;

	public Mazer() {
		Rb.init( this );
		mazeResourceType = new MazeResourceType( this );
	}

	/**
	 * Called when the mod is registered with the program.
	 */
	@Override
	public void register() {}

	/**
	 * Called when the mod is started. It is common to register custom icons,
	 * actions, resource types, tools, and long-running items like timers, tasks,
	 * and other threads in this method.
	 */
	@Override
	public void startup() {
		registerIcon( "mazer", new MazerIcon() );

		registerAction( this, "reset" );
		registerAction( this, "runpause" );

		registerResourceType( mazeResourceType );
		registerTool( mazeResourceType, new ToolRegistration( this, MazeTool.class ) );
	}

	/**
	 * Called when the mod should shut down. It is common to unregister custom icons, actions, resource types, tools and long running items like timers, tasks and other threads in this method.
	 */
	@Override
	public void shutdown() {
		unregisterTool( mazeResourceType, MazeTool.class );
		unregisterResourceType( mazeResourceType );

		unregisterAction( "runpause" );
		unregisterAction( "reset" );

		unregisterIcon( "mazer", new MazerIcon() );
	}

	/**
	 * Called when the mod is unregistered from the program.
	 */
	@Override
	public void unregister() {}

}

package com.acromere.mazer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MazeResourceTypeTest extends BaseMazerTest {

	@Test
	void testConstructor() {
		MazeResourceType type = new MazeResourceType( mazer );
		assertThat( type.getKey() ).isEqualTo( "application/vnd.acromere.mazer.maze" );
		assertThat( type.getName() ).isEqualTo( "Mazer Maze" );
	}

}

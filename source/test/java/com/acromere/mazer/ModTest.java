package com.acromere.mazer;

import com.acromere.product.ProductCard;
import com.acromere.product.Version;
import com.acromere.util.DateUtil;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;

import static org.assertj.core.api.Assertions.assertThat;

class ModTest extends BaseMazerTest {

	private static final SimpleDateFormat timestampFormat = new SimpleDateFormat( DateUtil.DEFAULT_DATE_FORMAT );

	@Test
	void testProductCard() throws Exception {
		ProductCard card = mazer.getCard();
		assertThat( card.getGroup() ).isEqualTo( "com.acromere" );
		assertThat( card.getArtifact() ).isEqualTo( "mazer" );
		assertThat( card.getVersion() ).isEqualTo( new Version( card.getVersion() ).toString() );
		assertThat( card.getTimestamp() ).isEqualTo( timestampFormat.format( timestampFormat.parse( card.getTimestamp() ) ) );

		assertThat( card.getPackaging() ).isEqualTo( "mod" );
		assertThat( card.getIcons() ).contains( "mazer", "https://acromere.com/download/latest/mazer/product/icon" );
		assertThat( card.getName() ).isEqualTo( "Mazer" );

		assertThat( card.getProvider() ).isEqualTo( "Acromere" );
		//assertThat( card.getProviderUrl()).isEqualTo( "https://www.acromere.com"));
		assertThat( card.getInception() ).isEqualTo( 2019 );
	}

}

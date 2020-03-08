package ua.lviv.iot.dwelling.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.dwelling.model.SortType;

public class DwellingManagerUtilsTest extends BaseDwellingManagerTest {

	@BeforeEach
	public void setUp() {
		createMansions();
	}

	@Test
	public void testSortingDescendingBySquare() {
		DwellingManagerUtils.sortBySquare(mansions, SortType.DESC);
		assertEquals(108.3, mansions.get(0).getAreaInSquareMeters());
		assertEquals(100, mansions.get(1).getAreaInSquareMeters());
		assertEquals(45.2, mansions.get(2).getAreaInSquareMeters());
		assertEquals(18.5, mansions.get(3).getAreaInSquareMeters());
	}

	@Test
	public void testSortingAscendingBySquare() {
		DwellingManagerUtils.sortBySquare(mansions, SortType.ASC);
		assertEquals(18.5, mansions.get(0).getAreaInSquareMeters());
		assertEquals(45.2, mansions.get(1).getAreaInSquareMeters());
		assertEquals(100, mansions.get(2).getAreaInSquareMeters());
		assertEquals(108.3, mansions.get(3).getAreaInSquareMeters());
	}

	@Test
	public void testSortingDescendingByPrice() {
		DwellingManagerUtils.sortByPrice(mansions, SortType.DESC);
		assertEquals(55000, mansions.get(0).getPriceInUSD());
		assertEquals(52000, mansions.get(1).getPriceInUSD());
		assertEquals(51000, mansions.get(2).getPriceInUSD());
		assertEquals(46000, mansions.get(3).getPriceInUSD());
	}

	@Test
	public void testSortingAscendingByPrice() {
		DwellingManagerUtils.sortByPrice(mansions, SortType.ASC);
		assertEquals(46000, mansions.get(0).getPriceInUSD());
		assertEquals(51000, mansions.get(1).getPriceInUSD());
		assertEquals(52000, mansions.get(2).getPriceInUSD());
		assertEquals(55000, mansions.get(3).getPriceInUSD());
	}
}

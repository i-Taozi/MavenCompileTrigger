/*
    This file is part of RouteConverter.

    RouteConverter is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    RouteConverter is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with RouteConverter; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Copyright (C) 2007 Christian Pesch. All Rights Reserved.
*/

package slash.navigation.nmn;

import org.junit.Test;
import slash.navigation.base.AllNavigationFormatRegistry;
import slash.navigation.base.NavigationFormatParser;
import slash.navigation.base.ParserResult;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static slash.navigation.base.NavigationTestCase.SAMPLE_PATH;

public class Nmn6FavoritesFormatIT {
    private final NavigationFormatParser parser = new NavigationFormatParser(new AllNavigationFormatRegistry());

    @Test
    public void testIsNmn6FavoritesWithValidPositions() throws IOException {
        File source = new File(SAMPLE_PATH + "Favorites-1.storage");
        ParserResult result = parser.read(source);
        assertNotNull(result);
        assertEquals(Nmn6FavoritesFormat.class, result.getFormat().getClass());
        assertEquals(result.getAllRoutes().size(), 1);
        assertEquals(result.getTheRoute().getPositionCount(), 2);
        assertEquals(result.getTheRoute().getPosition(0).getDescription(), "P Halleneu Cinemaxx, Neust�dter Passage");
    }

    @Test
    public void testIsNmn6FavoritesWithValidPositionsButRteExtension() throws IOException {
        File source = new File(SAMPLE_PATH + "Favorites.storage-2.rte");
        ParserResult result = parser.read(source);
        assertNotNull(result);
        assertEquals(Nmn6Format.class, result.getFormat().getClass());
        assertEquals(result.getAllRoutes().size(), 1);
        assertEquals(result.getTheRoute().getPositionCount(), 3);
        assertEquals(result.getTheRoute().getPosition(0).getDescription(), "JET M�NCHEN");
    }
}

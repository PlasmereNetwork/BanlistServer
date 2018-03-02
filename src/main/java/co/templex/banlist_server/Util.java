/*
 * Banlist Server: An HTTP server that serves the Templex banlist.
 * Copyright (C) 2018  vtcakavsmoace
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package co.templex.banlist_server;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Utilities class for this library.
 */
public class Util {

    /**
     * Hidden constructor. Instantiation of this class is not permitted.
     */
    private Util() {
        throw new UnsupportedOperationException("Instantiation not permitted.");
    }

    /**
     * Reads an entire file given a path instance.
     *
     * @param path The path of the file to read from.
     * @return bytes All bytes of this file in UTF-8 format contained within a single string.
     * @throws IOException If the read fails (file doesn't exist, lacks permissions, etc.)
     */
    public static String readPathAsString(Path path) throws IOException {
        return new String(Files.readAllBytes(path));
    }

}

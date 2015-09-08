package org.ghostwheel.utils;

/**
 * based on  org.encog.mathutil.matrices
 *
 */
public final class BiPolarUtil {

    private BiPolarUtil() { }
    /**
     * Convert a boolean to a bipolar number.
     *
     * @param b A boolean value to be converted.
     * @return A converted bipolar number.
     */
    public static double bipolar2double(final boolean b) {
        if (b) {
            return 1;
        }
        return -1;
    }

    /**
     * Convert a boolean array to a bipolar array.
     *
     * @param b A an array of boolean values.
     * @return An array of bipolar values.
     */
    public static double[] bipolar2double(final boolean[] b) {
        final double[] result = new double[b.length];

        for (int i = 0; i < b.length; i++) {
            result[i] = BiPolarUtil.bipolar2double(b[i]);
        }

        return result;
    }

    /**
     *
     * @param b An array of boolean values.
     * @return An array of bipolar values.
     */
    public static double[][] bipolar2double(final boolean[][] b) {
        final double[][] result = new double[b.length][b[0].length];

        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[0].length; col++) {
                result[row][col] = BiPolarUtil.bipolar2double(b[row][col]);
            }
        }

        return result;
    }

    /**
     * Convert a bipolar value to a boolean.
     *
     * @param d A bipolar value.
     * @return A boolean value.
     */
    public static boolean double2bipolar(final double d) {
        if (d > 0) {
            return true;
        }
        return false;
    }

    /**
     * Convert a bipolar array to booleans.
     *
     * @param d A bipolar array.
     * @return An array of booleans.
     */
    public static boolean[] double2bipolar(final double[] d) {
        final boolean[] result = new boolean[d.length];

        for (int i = 0; i < d.length; i++) {
            result[i] = BiPolarUtil.double2bipolar(d[i]);
        }

        return result;
    }

    /**
     * Convert a bipolar array to a boolean array.
     *
     * @param d A bipolar array.
     * @return A boolean array.
     */
    public static boolean[][] double2bipolar(final double[][] d) {
        final boolean[][] result = new boolean[d.length][d[0].length];

        for (int row = 0; row < d.length; row++) {
            for (int col = 0; col < d[0].length; col++) {
                result[row][col] = BiPolarUtil.double2bipolar(d[row][col]);
            }
        }

        return result;
    }

    /**
     * Normalize a binary number. If the number is not zero then make it 1, if
     * it is zero, leave it alone.
     *
     * @param d A number to normalize to binary.
     * @return A binary digit.
     */
    public static double normalizeBinary(final double d) {
        if (d > 0) {
            return 1;
        }
        return 0;
    }

    /**
     * Convert bipolar to binary.
     *
     * @param d A bipolar number.
     * @return A binary digit.
     */
    public static double toBinary(final double d) {
        return (d + 1) / 2.0;
    }

    /**
     * Convert binary to bipolar.
     *
     * @param d A binary number.
     * @return A bipolar number.
     */
    public static double toBiPolar(final double d) {
        return 2 * BiPolarUtil.normalizeBinary(d) - 1;
    }

    /**
     * Convert to binary and normalize.
     *
     * @param d A number to convert to binary.
     * @return A normalized binary number.
     */
    public static double toNormalizedBinary(final double d) {
        return BiPolarUtil.normalizeBinary(BiPolarUtil.toBinary(d));
    }


}

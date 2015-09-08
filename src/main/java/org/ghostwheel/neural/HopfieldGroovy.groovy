package org.ghostwheel.neural

import org.apache.commons.math3.linear.MatrixUtils
import org.apache.commons.math3.linear.RealMatrix
import org.ghostwheel.utils.BiPolarUtil

/**
 * HopfieldNetwork: This class implements a Hopfield neural network based on the book by Heaton.
 * A Hopfield neural network is fully connected and consists of a
 * single layer. Hopfield neural networks are usually used for
 * pattern recognition.
 * Created by vladyslavprytula on 17/08/15.
 */
class HopfieldGroovy implements BaseNetwork {

/**
 * The weight matrix for this neural network. A Hopfield
 * neural network is a
 * single layer, fully connected neural network.
 * The inputs and outputs to/from a Hopfield neural * network are always boolean values.
 */
    private RealMatrix realMatrix

    HopfieldGroovy(final int size) {
        this.realMatrix = MatrixUtils.createRealMatrix(size, size)
    }

    @Override
    void train(boolean[] pattern) {
        if (pattern.length != this.realMatrix.getColumnDimension()) {
            throw new NeuralNetworkError("Can't train a pattern of size "
                                        + pattern.length
                                        + " on a hopfield network of size ")
        }

    }

/**
 * Present a pattern to the neural network and receive the result.
 * @param pattern The pattern to be presented to the neural network.
 * @return The output from the neural network.
 * @throws <p>HopfieldException</p> The pattern caused a matrix math error.
 */
    @Override
    boolean[] present(final boolean[] pattern) {

        final boolean output[] = new boolean[pattern.length]

        // convert the input pattern into a matrix with a single row.
        // also convert the boolean values to
        // bipolar(-1=false, 1=true)
        final RealMatrix inputVector = MatrixUtils.createRealVector(BiPolarUtil.bipolar2double(pattern))

        return new boolean[0]
    }
}

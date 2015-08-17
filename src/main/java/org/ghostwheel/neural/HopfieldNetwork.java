package org.ghostwheel.neural;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;

/**
 * HopfieldNetwork: This class implements a Hopfield neural network.
 * A Hopfield neural network is fully connected and consists of a
 * single layer. Hopfield neural networks are usually used for
 * pattern recognition.
 * Created by vladyslavprytula on 17/08/15.
 */
public class HopfieldNetwork {
    /**
     * The weight matrix for this neural network.
     * A Hopfield neural network is a single layer, fully connected neural network.
     * The inputs and outputs to/from a Hopfield neural * network are always boolean values.
     */

    private RealMatrix weightMatrix;

    public HopfieldNetwork(final int size) {
        this.weightMatrix = MatrixUtils.createRealMatrix(size,size);
    }

    //N.B. at present I prefer not to use any kind of getters and setters for @weightMatrix. Let us see if it has to mutable?

}

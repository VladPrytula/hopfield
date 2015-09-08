package org.ghostwheel.neural;

import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.ghostwheel.utils.BiPolarUtil;

import javax.validation.constraints.NotNull;

/**
 * HopfieldNetwork: This class implements a Hopfield neural network based on the book by Heaton.
 * A Hopfield neural network is fully connected and consists of a
 * single layer. Hopfield neural networks are usually used for
 * pattern recognition.
 * Created by vladyslavprytula on 17/08/15.
 */
public class HopfieldNetwork implements BaseNetwork{
    /**
     * The weight matrix for this neural network.
     * A Hopfield neural network is a single layer, fully connected neural network.
     * The inputs and outputs to/from a Hopfield neural * network are always boolean values.
     */

    private RealMatrix weightMatrix;

    public HopfieldNetwork(final int size) {
        this.weightMatrix = MatrixUtils.createRealMatrix(size, size);
    }

    @Override
    public void train(boolean[] pattern) {

    }

    @Override
    public boolean[] present(@NotNull boolean[] pattern) {

        final boolean output[] = new boolean[pattern.length]; //TODO: i might run into the case when pattern is null

        // convert the input pattern into a matrix with a single row.
        // also convert the boolean values to bipolar(-1=false, 1=true)
        final RealMatrix inputMatrix = MatrixUtils.createRowRealMatrix(BiPolarUtil.bipolar2double(pattern));


        // Since at this point of time @weightMatrix should be already set we will use it to process the input signal

        return new boolean[0];
    }

    //N.B. at present I prefer not to use any kind of getters and setters for @weightMatrix. Let us see if it has to mutable?

}

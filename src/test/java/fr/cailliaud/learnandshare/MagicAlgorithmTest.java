package fr.cailliaud.learnandshare;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayName("Magic Algorithm should generate text thanks to a long training")
class MagicAlgorithmTest {

    @Test
    void should_not_generate_without_training() {
        MagicAlgorithm magicAlgorithm = MagicAlgorithm.create();
        AlgorithmUntrainedException algorithmUntrainedException = assertThrows(AlgorithmUntrainedException.class,
                () -> magicAlgorithm.generate("Once", 1));
        assertThat(algorithmUntrainedException.getMessage()).isEqualTo("Algorithm cannot generate text without training phase");
    }

    @Test
    void should_give_me_next_words() {
        // TODO
    }

    @Test
    void should_not_give_next_words() {
        // TODO
    }

    @Test
    void should_generate_text(){
        // TODO
    }

    static class Fixture{
        static final String LEARNING_TEXT = "les hommes libres peuvent rester libres ou bien vendre leur liberté";
    }

}
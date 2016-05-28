package org.batfish.common;

import org.batfish.datamodel.answers.Answer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(using = BatfishException.BatfishExceptionSerializer.class)
public class QuestionException extends BatfishException {

   /**
    *
    */
   private static final long serialVersionUID = 1L;

   private final Answer _answer;

   public QuestionException(String msg, Throwable cause, Answer answer) {
      super(msg, cause);
      _answer = answer;
   }

   @JsonIgnore
   public Answer getAnswer() {
      return _answer;
   }

}

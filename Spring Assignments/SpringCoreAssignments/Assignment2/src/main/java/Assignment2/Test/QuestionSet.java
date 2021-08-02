package Assignment2.Test;

import java.util.Set;

public class QuestionSet {
	int questionId;
	String question;

	Set<String> answers;

	public QuestionSet(int questionId, String question, Set<String> answers) {
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public void printQuestionAnswer() {
		System.out.println("Question Id: " + questionId);
		System.out.println("Question: " + question);
		System.out.println("Answer: " + answers);
	}
}

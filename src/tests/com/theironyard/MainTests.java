package com.theironyard;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

/**
 * Created by branden on 2/15/16 at 19:08.
 */
public class MainTests {


    @Test
    public void testiIsFlush() {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.ACE));
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.EIGHT));
        hand.add((new Card(Card.Suit.CLUBS, Card.Rank.FIVE)));
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.FOUR));

        Assert.assertTrue(Main.isFlush(hand));
    }


    @Test
    public void testIsStraight() {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.THREE));
        hand.add(new Card(Card.Suit.DIAMONDS, Card.Rank.FOUR));
        hand.add((new Card(Card.Suit.CLUBS, Card.Rank.FIVE)));
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.SIX));

        Assert.assertTrue(Main.isStraight(hand));
    }

    @Test
    public void testIsFour() {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.THREE));
        hand.add(new Card(Card.Suit.DIAMONDS, Card.Rank.THREE));
        hand.add((new Card(Card.Suit.SPADES, Card.Rank.THREE)));
        hand.add(new Card(Card.Suit.HEARTS, Card.Rank.THREE));

        Assert.assertTrue(Main.isFourOfaKind(hand));
    }

    @Test
    public void testIsThree() {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.THREE));
        hand.add(new Card(Card.Suit.DIAMONDS, Card.Rank.THREE));
        hand.add((new Card(Card.Suit.SPADES, Card.Rank.THREE)));
        hand.add(new Card(Card.Suit.HEARTS, Card.Rank.FOUR));

        Assert.assertTrue(Main.isThreeOfaKind(hand));
    }

    @Test
    public void testIdTwoPair() {
        HashSet<Card> hand = new HashSet<>();
        hand.add(new Card(Card.Suit.CLUBS, Card.Rank.THREE));
        hand.add(new Card(Card.Suit.DIAMONDS, Card.Rank.THREE));
        hand.add((new Card(Card.Suit.SPADES, Card.Rank.FOUR)));
        hand.add(new Card(Card.Suit.HEARTS, Card.Rank.FOUR));

        Assert.assertTrue(Main.isTwoPair(hand));
    }


}
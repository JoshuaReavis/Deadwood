package edu.wwu.cs.deadwood.board.gui;

import edu.wwu.cs.deadwood.Game;
import edu.wwu.cs.deadwood.Player;
import edu.wwu.cs.deadwood.assets.Role;
import edu.wwu.cs.deadwood.assets.Room;
import edu.wwu.cs.deadwood.board.Board;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Collection;
import java.util.Map;

/**
 * @author Connor Hollasch
 * @since October 31, 1:54 PM
 */
public class GUIBoard implements Board
{
    private final Game game;

    private JFrame frame;

    private ActionPanel actionPanel;
    private BoardPanel boardPanel;

    public GUIBoard (final Game game)
    {
        this.game = game;
    }

    public void displayWindow ()
    {
        this.frame = new JFrame("Deadwood");
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.frame.add(this.actionPanel = new ActionPanel(game, this), BorderLayout.LINE_END);
        this.frame.add(this.boardPanel = new BoardPanel(this.game), BorderLayout.CENTER);

        this.frame.addComponentListener(new ComponentListener()
        {
            @Override
            public void componentResized (final ComponentEvent componentEvent)
            {
                GUIBoard.this.boardPanel.repaint();
            }

            @Override
            public void componentMoved (final ComponentEvent componentEvent)
            {
                GUIBoard.this.boardPanel.repaint();
            }

            @Override
            public void componentShown (final ComponentEvent componentEvent)
            {
                GUIBoard.this.boardPanel.repaint();
            }

            @Override
            public void componentHidden (final ComponentEvent componentEvent)
            {
                GUIBoard.this.boardPanel.repaint();
            }
        });

        this.frame.pack();

        this.frame.setVisible(true);
    }

    public void destroyWindow ()
    {
        // Destroy the frame.
    }

    @Override
    public void refreshBoard ()
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }

    @Override
    public void sceneWrapped (Room room, Map<Player, Collection<Integer>> onCardPayouts, final Map<Player, Integer> offCardPayouts)
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }

    @Override
    public void dayWrapped ()
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }

    @Override
    public void endGame ()
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }

    @Override
    public void playerActed (final Player player, final boolean successful, final int diceRoll)
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }

    @Override
    public void playerEndedTurn (final Player old, final Player newPlayer)
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }

    @Override
    public void playerMoved (final Player player, final Room newRoom)
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }

    @Override
    public void playerRehearsed (final Player player)
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }

    @Override
    public void playerTookRole (final Player player, final Role role)
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }

    @Override
    public void playerUpgraded (final Player player, final boolean usedCredits, final int rankUpgradingTo)
    {
        this.actionPanel.update();
        this.boardPanel.repaint();
    }
}

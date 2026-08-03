package net.luke.trainingmod.client.gui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ModStandaloneScreen extends Screen {
    private EditBox inputField;

    protected ModStandaloneScreen(Component title) {
        super(Component.literal("GUI"));
    }

    @Override
    protected void init() {
        super.init();

        int centerX = this.width / 2;
        int centerY = this.height / 2;

        this.inputField = new EditBox(this.font, centerX - 100, centerY - 30, 200, 20, Component.literal("Input"));
        this.inputField.setMaxLength(64);
        this.addRenderableWidget(this.inputField);

        this.addRenderableWidget(
                Button.builder(Component.literal("Print Text"), button -> onPressPrint())
                        .bounds(centerX - 50, centerY + 10, 100, 20)
                        .build()
        );
    }

    private void onPressPrint() {
        String enteredText = this.inputField.getValue();
        System.out.println("Player entered: " + enteredText);
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(graphics, mouseX, mouseY, partialTick);
        super.render(graphics, mouseX, mouseY, partialTick);
        graphics.drawCenteredString(this.font, this.title, this.width / 2, 20, 0xFFFFFF);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
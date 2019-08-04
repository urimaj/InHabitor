package com.ujl.inhabitor.presenters;

/**
 * We are using MVP pattern for our views.
 */
public interface IPresenter {

    /**
     * call this function to update the view.
     * @param data
     */
    void update(Object data);
}

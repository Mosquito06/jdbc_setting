package kr.or.dgit.jdbc_setting;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import kr.or.dgit.jdbc_setting.service.DbService;
import kr.or.dgit.jdbc_setting.service.ExportService;
import kr.or.dgit.jdbc_setting.service.ImportService;
import kr.or.dgit.jdbc_setting.service.InitService;

// ���� ��ư�� ���� �̺�Ʈ�� �����ϴ� �� �ٸ� ���
// actionPerformed�� ������
// AbstractAction�� ��ӹ޾� ����
public class BtnAction extends AbstractAction {

	public BtnAction(String name) {
		super(name);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DbService service = null;
		// �ʱ�ȭ, ���, ����
		switch (e.getActionCommand()) {
		case "�ʱ�ȭ":
			service = InitService.getInstance();
			break;
		case "���":
			service = ExportService.getInstance();
			break;
		case "����":
			service = ImportService.getInstance();
			break;
		}
		service.service();
		JOptionPane.showMessageDialog(null, e.getActionCommand() + "��(��) �Ϸ�Ǿ����ϴ�.");
	}

}
